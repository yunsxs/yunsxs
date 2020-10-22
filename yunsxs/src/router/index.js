import Vue from 'vue'
import Router from 'vue-router'
// import HelloWorld from '@/components/HelloWorld'
import Login from '../views/login/Login'
import Register from '../views/login/Register'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      // component: HelloWorld
      redirect: '/login'
    },
    {
      path: '/login',
      component: Login
    },
    {
      path: '/register',
      component: Register
    },
    {
      path: '',
      redirect: "/home",
      name: 'Home',
      meta: {
        requireAuth: true
      },
      component: resolve => require(["@/views/Home/Home"], resolve),
      children: [
        {
          path: '/home',
          name: 'home',
          component: resolve => require(["@/views/Home/Home"], resolve),
        }
      ]
    }
  ]
})
