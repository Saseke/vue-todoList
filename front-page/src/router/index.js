import Vue from 'vue'
import Router from 'vue-router'
import Layouts from '@/components/layouts'
import todo from '@/components/todo'

Vue.use(Router)  // 全局注册路由

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Layouts',
      component: Layouts,
      children: [{
        path: '/todo/:id',
        name: 'todo',
        component: todo
      }]
    }
  ]
})
