<template>
  <div class="level_content">
    <el-popover placement="bottom-end" trigger="hover">
      <div class="content">
        <div><span>Lv1</span>0~300 积分</div>
        <div><span>Lv2</span>300~800 积分</div>
        <div><span>Lv3</span>800~1500 积分</div>
        <div><span>Lv4</span>1500~2500 积分</div>
        <div><span>Lv5</span>2500+ 积分</div>
      </div>
      <div slot="reference" class="level_outter_title">
        <i class="el-icon-medal"></i>
        <span>等级规则</span>
      </div>
    </el-popover>
  </div>
</template>

<script>
export default {
  data() {
    return {}
  }
}
</script>

<style scoped>
.level_outter_title:hover span {
  color: red;
}

.content {
  font-size: 15px;
  color: rgb(140, 197, 255);
}
.content > div {
  margin: 5px 0;
  padding: 0 5px;
}
.content > div > span {
  margin-right: 10px;
}
</style>