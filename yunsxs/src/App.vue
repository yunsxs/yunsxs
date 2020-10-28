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

.login_content .el-input__inner {
  /* background-color: rgba(171, 219, 247, 0.5); */
  background-color: rgba(0, 0, 0, 0.2);
  color: white;
}

.login_content .el-input__inner::-webkit-input-placeholder {
  /* color: rgb(80, 79, 77); */
  color: #ffffff;
}

.login_content .el-form-item__error {
  color: rgba(211, 41, 41, 1);
  /* font-weight: 700; */
  font-size: 13px;
}
</style>
