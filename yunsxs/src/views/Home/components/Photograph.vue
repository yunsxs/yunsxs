<template>
  <el-container style="height: 100%">
    <el-main>
      <!-- 自己的发布区域 -->
      <div class="user_edit">
        <el-input
          type="textarea"
          :rows="4"
          placeholder="说点什么吧"
          v-model="textarea"
        >
        </el-input>
        <el-upload
          class="pic_upload"
          ref="upload"
          :action="uploadUrl"
          :on-success="handleSuccess"
          :on-change="handleChange"
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
              style="width: 33%; height: 33%"
              src="https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg"
              fit="fill"
              :preview-src-list="[
                'https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg',
              ]"
            ></el-image>
          </div>
        </div>
      </div>
    </el-main>
  </el-container>
</template>

<script>
export default {
  created() {
    this.getAllBlog()
  },
  data() {
    return {
      circleUrl:
        'https://cube.elemecdn.com/3/7c/3ea6beec64369c2642b92c6726f1epng.png',
      topHeight: 0,
      textarea: '',
      fileList: [],
      imgDialogVisible: false,
      uploadUrl: 'http://localhost:8081/yunsxs_api_war/api/upload',
      dialogVisible: false,
      dialogImageUrl: '',
      blog: {
        content: '',
        pictures: [],
        time: '',
      },
      allBlog: {},
    }
  },
  methods: {
    handleSuccess(res, file) {
      console.log(res, file)
    },
    handleChange(file) {
      this.fileList.push(file)
    },
    handlePictureCardPreview(file) {
      this.dialogVisible = true
      this.dialogImageUrl = file.url
    },
    handleRemove(file) {
      const index = this.fileList.indexOf(file)
      this.fileList.splice(index, 1)
    },
    async getAllBlog() {
      const { data: res } = await this.$http.get('blog/getAllBlog')
      this.allBlog = res.data
      this.allBlog.forEach((v) => {
        v.pictures = v.pictures ? v.pictures.split(';') : []
      })
      console.log(this.allBlog)
    },
  },
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