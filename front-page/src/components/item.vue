<template>
  <div class="list-item editingClass editing">
    <label class="checkbox">
      <input type="checkbox" v-model="item.checked">
      <span class="checkbox-custom"></span>
    </label>
    <input type="text" v-model="item.text" placeholder='写点什么。。。'>
    <a class="delete-item">
      <span class="icon-trash"></span>
    </a>
  </div>
</template>
<script>
  // item 是todo的子组件,他接受一个对象item,来进行处理
  export default {
    props: {
      item: {
        type: Object,
        default: () => {
          return {
            checked: false,
            text: '你好,世界'
          }
        }
      }
    }
  };
</script>
<style lang="less">
  @import '../common/style/list-items.less';
</style>
