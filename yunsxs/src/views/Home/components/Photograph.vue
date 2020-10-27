<template>
  <el-container style="height: 100%">
    <el-main>
      <!-- 自己的发布区域 -->
      <div class="user_edit" @blur="handleBlur">
        <el-input
          type="textarea"
          :rows="4"
          placeholder="说点什么吧"
          v-model="textarea"
          @focus="handleFocus"
        >
        </el-input>
        <el-upload
          action="#"
          :auto-upload="false"
          list-type="picture-card"
          :file-list="fileLists"
        >
          <i class="el-icon-plus"></i>
        </el-upload>
        <el-dialog
          :visible.sync="imgDialogVisible"
          size="full"
          :modal="false"
          title="查看大图片"
        >
          <img width="100%" alt="" />
        </el-dialog>
      </div>
      <div class="text_container">
        <!-- 头像区域 -->
        <div class="block text_info">
          <el-avatar :size="50" :src="circleUrl"></el-avatar>
          <div class="text_direction">
            <div class="user_name">hashihui</div>
            <div class="time">2020</div>
          </div>
        </div>
        <div class="block text-detail">
          <!-- 内容 -->
          <div class="text">
            一、政策出台背景
            根据《中共江西省委、江西省人民政府关于深入实施创新驱动发展战略推进创新型省份建设的意见》（赣发〔2016〕5号）和《九江市加大全社会研发投入攻坚行动方案》文件精神，为着力支持发展我县首位产业和重点产业，鼓励企业加大研发投入和创新转型升级，促进我县产业发展和经济稳定增长。
            二、目标任务
            培植我县首位产业（机械制造）和重点产业（绿色食品）的壮大与发展，加快传统产业转型升级，大力实施创新驱动发展战略，引导并激励企业不断加大研发投入，促进我县社会研发投入持续增长和科技创新驱动能力不断提升。
            三、主要内容
            县委、县政府每年安排5000万元财政专项资金，主要支持机械制造和绿色食品产业中重点企业的技术研发、科技创新、人才引进和科技成果转化，基金采取以奖代补的方式。
            四、涉及范围
            主要针对落户我县的机械制造产业企业（首位产业）和绿色食品产业企业（重点产业）。
            五、执行标准
            一是对企业在项目技术改造、技术创新、研究开发等过程中的相关支出进行支持，支持金额不超过项目研发支出的10%，支持额度不超过200万元。
            二是企业当年产品获得国家发明专利一项的，给予最高支持不超过20万元奖励；获得实用新型专利的给予一项最高支持不超过1万元奖励，获得外观设计专利的给予一项的最高支持不超过0.1万元奖励。
            三是企业建立院士工作站的支持50万元，建立博士后科研工作站、博士后科研流动站、博士后创新实践基地的支持20万元。
            四是企业每引进一名高科技人才，给予相应奖励。引进院士的，一次性奖励5万元；引进一名博士学位以上或具有专业高级职称以上人才且工作时间一年以上的，一次性奖励3万元；引进一名硕士学位或具有专业中级职称以上人才且工作时间一年以上的，一次性奖励1万元。
          </div>
          <div class="photos">
            <el-image
              style="width: 32%; height: 32%"
              src="https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg"
              fit="fill"
              :preview-src-list="[
                'https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg',
              ]"
            ></el-image>
            <el-image
              style="width: 32%; height: 32%"
              src="https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg"
              fit="fill"
              :preview-src-list="[
                'https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg',
              ]"
            ></el-image>
            <el-image
              style="width: 32%; height: 32%"
              src="https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg"
              fit="fill"
              :preview-src-list="[
                'https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg',
              ]"
            ></el-image>
            <el-image
              style="width: 32%; height: 32%"
              src="https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg"
              fit="fill"
              :preview-src-list="[
                'https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg',
              ]"
            ></el-image>
            <el-image
              style="width: 32%; height: 32%"
              src="https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg"
              fit="fill"
              :preview-src-list="[
                'https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg',
              ]"
            ></el-image>
            <el-image
              style="width: 32%; height: 32%"
              src="https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg"
              fit="fill"
              :preview-src-list="[
                'https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg',
              ]"
            ></el-image>
            <el-image
              style="width: 32%; height: 32%"
              src="https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg"
              fit="fill"
              :preview-src-list="[
                'https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg',
              ]"
            ></el-image>
            <el-image
              style="width: 32%; height: 32%"
              src="https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg"
              fit="fill"
              :preview-src-list="[
                'https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg',
              ]"
            ></el-image>
            <el-image
              style="width: 32%; height: 32%"
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
  data() {
    return {
      circleUrl:
        "https://cube.elemecdn.com/3/7c/3ea6beec64369c2642b92c6726f1epng.png",
      topHeight: 0,
      textarea: "",
      fileLists: [],
      imgDialogVisible: false,
    };
  },
  methods: {
    handleFocus() {
      this.topHeight = 40;
      console.log(this.fileLists);
    },
    handleBlur() {
      this.topHeight = 0;
    },
  },
};
</script>

<style scoped>
.user_edit {
  margin-bottom: 40px;
}

/* /deep/ .el-upload--picture-card {
  width: 100px;
  height: 100px;
}
/deep/ .el-upload {
  width: 100px;
  height: 100px;
  line-height: 100px;
}
/deep/ .el-upload-list--picture-card .el-upload-list__item {
  width: 100px;
  height: 100px;
  line-height: 100px;
}
/deep/ .el-upload-list--picture-card .el-upload-list__item-thumbnail {
  width: 100px;
  height: 100px;
  line-height: 100px;
}
/deep/ .avatar {
  width: 100px;
  height: 100px;
} */

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
  text-align: center;
}
</style>