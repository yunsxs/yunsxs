import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/index',
      name: indexedDB,
      component: resolve => require(["@/views/index/index"], resolve),
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
          path: '/photograph',
          name: 'photograph',
          component: resolve => require(["@/views/Home/components/Photograph"], resolve)
        },
        {
          path: '/videoNews',
          name: 'videoNews',
          component: resolve => require(['@/views/Home/components/VideoNews'], resolve)
        }
      ]
    }
  ]
})
