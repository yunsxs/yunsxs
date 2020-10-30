<template>
  <el-container style="height: 100%">
    <el-main>
      <!-- 自己的发布区域 -->
      <div class="user_edit">
        <el-input
          type="textarea"
          :rows="4"
          placeholder="说点什么吧"
          v-model="blog.content"
        >
        </el-input>
        <el-upload
          class="pic_upload"
          ref="upload"
          :action="uploadUrl"
          :on-success="handleSuccess"
          :on-preview="handlePictureCardPreview"
          :on-remove="handleRemove"
          list-type="picture-card"
          :multiple="true"
          :limit="9"
        >
          <i class="el-icon-plus"></i>
          <div slot="tip" class="el-upload__tip">最多只能上传9张图片</div>
        </el-upload>
        <el-dialog :visible.sync="dialogVisible">
          <img width="100%" :src="dialogImageUrl" alt="" />
        </el-dialog>
        <!-- 上传按钮 -->
        <el-button type="primary" @click="handleSubmit">点击发布</el-button>
      </div>
      <div class="text_container" v-for="one in allBlog" :key="one.blogid">
        <!-- 头像区域 -->
        <div class="block text_info">
          <el-avatar :size="50" :src="circleUrl"></el-avatar>
          <div class="text_direction">
            <div class="user_name">{{ one.user.username }}</div>
            <div class="time">{{ one.time }}</div>
          </div>
        </div>
        <div class="block text-detail">
          <!-- 内容 -->
          <div class="text">
            {{ one.content }}
          </div>
          <div class="photos">
            <el-image
              v-for="pic in one.pictures"
              :key="pic"
              style="width: 32.5%; height: 195px; margin-right: 5px"
              :src="baseURL + pic"
              :preview-src-list="showPics(one.pictures)"
              fit="cover"
              lazy
            >
              <div slot="error" class="image-slot">
                <i class="el-icon-picture-outline"></i>
              </div>
            </el-image>
          </div>
        </div>
      </div>
    </el-main>
  </el-container>
</template>

<script>
import { addScore, getActionInfo, updateUserScore } from '../../util/api_post'
export default {
  created() {
    this.getAllBlog()
  },
  data() {
    return {
      circleUrl:
        'https://cube.elemecdn.com/0/88/03b0d39583f48206768a7534e55bcpng.png',
      imgDialogVisible: false,
      // 图片上传到路径
      uploadUrl: 'http://localhost:8081/yunsxs_api/api/upload',
      baseURL: 'http://localhost:8081/yunsxs_api/',
      dialogVisible: false,
      dialogImageUrl: '',
      blog: {
        userid: '',
        content: '',
        pictures: [],
        time: ''
      },
      // 所有的随手拍内容
      allBlog: {},
      userInfo: {}
    }
  },
  methods: {
    // 图片上传成功
    handleSuccess(res, file) {
      if (res.code !== 200)
        return this.$message.error('上传图片失败，请重新上传')
      this.blog.pictures.push(res.data.path)
    },
    // 处理图片预览
    handlePictureCardPreview(file) {
      this.dialogVisible = true
      this.dialogImageUrl = file.url
    },
    // 处理图片删除效果
    handleRemove(file) {
      const filePath = file.response.data.path
      const index = this.blog.pictures.indexOf(filePath)
      if (index >= 0) {
        this.blog.pictures.splice(index, 1)
      }
    },
    // 获取所有的随手拍内容
    async getAllBlog() {
      const { data: res } = await this.$http.get('blog/getAllBlog')
      this.allBlog = res.data
      this.userInfo = res.data[0].user
      this.allBlog.forEach((v) => {
        v.pictures = v.pictures ? v.pictures.split(';') : []
      })
    },
    // 提交编辑的内容
    async handleSubmit() {
      let postBlog = JSON.parse(JSON.stringify(this.blog))
      if (!postBlog.content.trim() && postBlog.pictures.length === 0) {
        return this.$message.error('内容不能为空')
      }
      const userid = window.sessionStorage.getItem('userId')
      postBlog.userid = userid
      postBlog.time = new Date().toLocaleString()
      postBlog.pictures = postBlog.pictures.join(';')
      const { data: res } = await this.$http.post('blog/insert', postBlog)
      // 向action表添加数据
      addScore(userid, 2)
      // 更新user表中的score
      const userLevel = this.userInfo.userlevel
      const userScore = this.userInfo.userscore
      updateUserScore(userid, userLevel, userScore, 3)
      if (res.code !== 200) return this.$message.error('发布失败')
      this.$message.success('发布成功，积分+3')
      this.blog = {
        userid: '',
        content: '',
        pictures: [],
        time: ''
      }
      this.$refs.upload.clearFiles()
      this.getAllBlog()
      // 重新加载组件
      this.$emit('update', userid)
    },
    showPics(picList) {
      return picList ? picList.map((v) => this.baseURL + v) : []
    }
  }
}
</script>

<style scoped>
.user_edit {
  margin-bottom: 40px;
}

.user_edit_bottom {
  /* border: 1px solid #cccccc; */
  overflow: hidden;
  transition: all 0.5s;
}

.text_container {
  /* border-bottom: 1px solid black; */
  padding: 20px;
  box-shadow: 0 0 10px #ccc;
  margin-bottom: 30px;
  transition: all 12s;
}
.text_info {
  margin-bottom: 20px;
}
.el-avatar {
  vertical-align: middle;
}
.text_direction {
  display: inline-block;
  vertical-align: middle;
  margin-left: 10px;
}

.text_direction .user_name {
  font-size: 15px;
  margin: 5px 0;
}

.text_direction .time {
  font-size: 12px;
  margin: 5px 0;
}

.text-detail .text {
  margin-bottom: 20px;
}

.text-detail .photos {
  margin: 0 auto;
  text-align: left;
}
</style>