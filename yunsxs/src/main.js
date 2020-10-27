// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import './assets/css/home.css'
import '@/assets/font/icon/iconfont.css'
import '@/assets/font/icon/demo.css'
import axios from 'axios'
Vue.use(ElementUI)
Vue.config.productionTip = false

axios.defaults.baseURL = 'http://localhost:8081/api/'

Vue.prototype.$http = axios

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
