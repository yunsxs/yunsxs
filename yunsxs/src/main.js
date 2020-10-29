// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import store from './store';
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import './assets/css/home.css'
import '@/assets/font/icon/iconfont.css'
import axios from 'axios'
Vue.use(ElementUI)
Vue.config.productionTip = false

axios.defaults.baseURL = 'http://localhost:8081/yunsxs_api/api/'

Vue.prototype.$http = axios

Vue.prototype.$message = function (msg) {
  ElementUI.Message(msg)
}
Vue.prototype.$message.success = function (msg) {
  return ElementUI.Message.success({
    message: msg,
    duration: 1000
  })
}
Vue.prototype.$message.error = function (msg) {
  return ElementUI.Message.error({
    message: msg,
    duration: 1000
  })
}

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  store,
  components: { App },
  template: '<App/>'
})
