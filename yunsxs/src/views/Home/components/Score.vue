<template>
  <div>
    <el-tooltip :popper-class="toolTipClass" placement="bottom" effect="light">
      <div slot="content">
        <div class="score_title">
          <span>积分：{{ score }}</span>
          <el-tooltip class="item" effect="dark" placement="right-start">
            <i class="el-icon-s-opportunity"></i>
            <div slot="content">
              <p>1.每日签到获得2积分</p>
              <p>2.发布随手拍获得3积分</p>
              <p>3.补全个人信息获得10积分</p>
            </div>
          </el-tooltip>
        </div>
        <div class="score_body">
          <div>
            <ol>
              <li v-for="(item, index) in list" :key="index">
                <span>{{ item.name }}</span>
                <span>+{{ item.score }}</span>
              </li>
            </ol>
          </div>
        </div>
        <div class="score_bottom"><span>只显示最近十条记录</span></div>
      </div>
      <div class="list_a">
        <i class="el-icon-star-off"></i>
        <span>积分管理</span>
      </div>
    </el-tooltip>
  </div>
</template>
<script>
export default {
  props: {
    list: {
      type: Array,
      default: () => {
        return []
      }
    },
    score: {
      type: Number,
      default: 0
    }
  },
  watch: {
    $route(toRouter, fromRouter) {
      this.doMemuActive(toRouter)
    }
  }
}
</script>
<style>
.home .toolTipClass {
  width: 3000px;
  height: 5000px;
}
.score_title {
  width: 300px;
  height: 50px;
  font-size: 18px;
  line-height: 50px;
  color: #409eff;
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: space-between;
}
.score_title span {
  padding-left: 20px;
}
.score_body > div {
  width: auto;
  height: 300px;
  overflow-y: scroll;
}
.score_body {
  width: 300px;
  height: 300px;
  border: 1px solid rgb(255, 113, 0);
}
.score_body > div::-webkit-scrollbar {
  /*隐藏滚轮*/
  display: none;
}
.score_body ol {
  padding: 0px;
  margin: 0px;
  padding-left: 10px;
}
.score_body ol li {
  width: 90%;
  height: 40px;
  margin: 0px auto;
  line-height: 40px;
  font-size: 16px;
  color: rgb(140, 197, 255);
  border-bottom: 1px solid #eee;
}
.score_body ol li:hover {
  background-color: #f2f6fc;
}
.score_body ol li span:last-child {
  float: right;
  padding-right: 10px;
}
.score_bottom {
  width: 100%;
  height: 25px;
  margin-top: 10px;
  line-height: 25px;
  text-align: right;
  font-size: 13px;
  color: rgba(0, 0, 0, 0.7);
}
</style>