import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path:'/index',
      name:indexedDB,
      component:resolve=>require(["@/views/index/index"],resolve),
    },
    {
      path: '',
      redirect: "/home",
      name: 'Home',
      meta: {
        requireAuth: true
      },
      component:resolve=>require(["@/views/Home/Home"],resolve),
      children:[
        {
          path: '/home',
          name: 'home',
          component:resolve=>require(["@/views/Home/Home"],resolve),
        }
      ]
    }
  ]
})
