<template>
  <div id="app">
    <router-view />
  </div>
</template>

<script>
export default {
  name: 'App',
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  margin: 0px;
  padding: 0px;
  color: #2c3e50;
}

.news_content .news_detail img {
  width: 100%;
}

.news_content .el-submenu__title {
  padding: 0 !important;
}

.news_detail .ql-align-right {
  text-align: right;
}

.news_detail .ql-align-center {
  text-align: center;
}
</style>
