import Vue from 'vue'
import Router from 'vue-router'
/*引入登录界面*/
import Home from '@/components/HelloWorld.vue'
import Login from '@/components/login.vue'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Login',
      component: Login
    },
    {
      path: '/hello',
      name: 'Home',
      component: Home
    }
  ]
})
