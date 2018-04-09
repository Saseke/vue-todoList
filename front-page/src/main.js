import Vue from 'vue'
import App from './App'
import router from './router'
import store from './vuex/store';
Vue.config.productionTip = false;

new Vue({
  el: '#app',
  store,  //注入
  router,
  components: { App },
  template: '<App/>'
});
