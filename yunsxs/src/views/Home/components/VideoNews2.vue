<template>
  <!-- 视频新闻 -->
  <el-container style="height: 100%">
    <el-aside width="250px">
      <ul class="news_name">
        <li>
          <i class="el-icon-collection prefix"></i>
          <span>2020年10月9日视频新闻</span>
          <i class="el-icon-arrow-right"></i>
        </li>
        <li>
          <i class="el-icon-collection prefix"></i>
          <span>2020年10月9日视频新闻</span>
          <i class="el-icon-arrow-right"></i>
        </li>
        <li>
          <i class="el-icon-collection prefix"></i>
          <span>2020年10月9日视频新闻</span>
          <i class="el-icon-arrow-right"></i>
        </li>
        <li>
          <i class="el-icon-collection prefix"></i>
          <span>2020年10月9日视频新闻</span>
          <i class="el-icon-arrow-right"></i>
        </li>
      </ul>
    </el-aside>
    <el-main>
      <h2>2020年10月9日视频新闻</h2>
      <div class="news_direction">
          
      </div>
    </el-main>
  </el-container>
</template>

<script>
export default {};
</script>

<style scoped>
.news_name li {
  height: 55px;
  line-height: 55px;
  text-align: center;
  font-size: 15px;
}

.news_name li {
  transition: all 0.3s;
  position: relative;
  cursor: pointer;
  text-align: left;
}

.news_name li span {
  display: inline-block;
  color: black;
  transition: all 0.3s;
  -moz-user-select: none;
  user-select: none;
  -webkit-user-drag: none;
}
.news_name li:hover {
  background-color: #ecf5ff;
}
/* .news_name li:hover a {
  color: #409eff;
} */
.news_name li .prefix {
  display: inline-block;
  margin: 0 5px;
}
.news_name li .el-icon-arrow-right {
  position: absolute;
  top: 50%;
  right: 10px;
  transform: translateY(-50%);
}
</style>