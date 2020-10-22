<template>
  <div id="app">
    <!-- <img src="./assets/logo.png"> -->
    <router-view />
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
* {
  padding: 0;
  margin: 0;
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
