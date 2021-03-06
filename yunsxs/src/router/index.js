import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      redirect: "/login"
    },
    {
      path: '/home',
      redirect: "/government",
      name: 'Home',
      meta: {
        requireAuth: true
      },
      component: resolve => require(["@/views/Home/Home"], resolve),
      children: [
        {
          path: '/government',
          name: 'Government',
          component: resolve => require(["@/views/Home/components/Government"], resolve),
        },
        {
          path: '/enterxs',
          name: 'Enterxs',
          component: resolve => require(["@/views/Home/components/EnterXs"], resolve),
        },
        {
          path: '/photograph',
          name: 'photograph',
          component: resolve => require(["@/views/Home/components/Photograph"], resolve)
        },
        {
          path: '/videoNews',
          name: 'videoNews',
          component: resolve => require(['@/views/Home/components/VideoNews'], resolve)
        },
        {
          path: '/user',
          name: 'user',
          component: resolve => require(['@/views/Home/components/User'], resolve)
        },
        {
          path: '/travel',
          name: 'travel',
          component: resolve => require(['@/views/Home/components/Travel'], resolve)
        }
      ]
    },
    {
      path: '/login',
      name:'Login',
      component: resolve => require(['@/views/login/Login'], resolve),
      meta: {show: true}
    },
    {
      path: '/register',
      name:'Register',
      component: resolve => require(['@/views/login/Register'], resolve)
    },
    {
      path: '/index',
      name:'index',
      component: resolve => require(['@/views/index/index'], resolve)
    }
  ]
})
