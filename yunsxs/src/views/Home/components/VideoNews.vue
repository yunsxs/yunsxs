<template>
  <!-- 视频新闻 -->
  <el-container style="height: 100%" class="news_content">
    <el-aside width="260px">
      <el-menu :default-active="defaultId">
        <el-submenu
          v-for="news in newsType"
          :key="news.typeId"
          :index="news.typeId.toString()"
        >
          <template slot="title">
            <i :class="iconObj[news.typeId]"></i>
            <span>{{ news.typeName }}</span>
          </template>

          <el-menu-item
            @click="change(oneNews)"
            v-for="oneNews in news.children"
            :key="oneNews.news_id"
            :index="oneNews.news_id.toString()"
            >{{ oneNews.news_title }}</el-menu-item
          >
        </el-submenu>
      </el-menu>
    </el-aside>
    <el-main>
      <div class="news_container">
        <h2>{{ news.news_title }}</h2>
        <div class="news_direction">
          <span>来源:修水报</span>
          <span>作者:{{ news.up }}</span>
          <span>发布时间：{{ news.reg_time }}</span>
        </div>
        <div class="news_detail" v-html="news.substance"></div>
        <div style="height:200px;"></div>
      </div>
    </el-main>
  </el-container>
</template>

<script>
export default {
  created() {
    // 获取新闻列表
    this.getAllNewsList()
  },
  data() {
    return {
      newsType: [],
      news: {},
      defaultId: '',
      iconObj: {
        1: 'el-icon-s-comment',
        2: 'el-icon-notebook-1',
        3: 'el-icon-tableware',
        4: 'el-icon-film',
      },
    }
  },
  methods: {
    async getAllNewsList() {
      const { data: res } = await this.$http.get('news/getAllNews')
      if (res.code !== 200) return this.$message.error('获取新闻列表失败')
      this.news = res.data[0].children[0]
      this.defaultId = res.data[0].children[0].news_id.toString()
      this.newsType = res.data
    },
    change(news) {
      this.news = news
    },
  },
}
</script>

<style scoped>
.news_container h2 {
  text-align: center;
  color: #409eff;
  margin: 0 0 20px;
}

.news_direction {
  text-align: center;
  color: #8b8b8b;
  font-size: 15px;
  margin-bottom: 40px;
}
.news_direction span {
  display: inline-block;
  margin-right: 10px;
}

.news_detail {
  font-size: 15px;
  line-height: 30px;
}

.el-menu-item {
  width: 100%;
  text-align: left;
  padding: 0 !important;
  overflow: hidden;
  text-overflow: ellipsis;
}
</style>