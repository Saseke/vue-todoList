<template>
  <div class="list-todos">
    <!-- 绑定class，当items循环中的id等于我们设置的选中todoId时候,就会加上active这个calss,这样样式就会发生变化。-->
    <a @click="goList(itemDto.todo.id)" class="list-todo list activeListClass"
       :class="{'active': itemDto.todo.id === todoId}"
       v-for="itemDto in itemDtos">
      <span class="icon-lock" v-if="itemDto.todo.locked"></span>
      <span class="count-list" v-if="itemDto.todo.count > 0">{{itemDto.todo.count}}</span>
      {{itemDto.todo.title}}
    </a>
    <a class=" link-list-new" @click="addTodoList">
      <span class="icon-plus">
      </span>
      新增
    </a>
  </div>
</template>
<script>
  import {addTodo, getTodoList} from "../api/api";

  export default {
    data() {
      return {
        itemDtos: [], // 菜单数据
        todoId: '' // 选中的id
      };
    },
    created() {
      getTodoList({}).then(res => {
        this.itemDtos = res.data.data;
      });
    },
    methods: {
      goList(id) {  // 点击菜单的时候，替换掉选中的id
        this.todoId = id;
      },
      addTodoList() {   // 点击新增按钮的时候
        addTodo({}).then(data => {
          getTodoList({}).then(res => {
            const TODOS = res.data.data;
            this.todoId = TODOS[TODOS.length - 1].todo.id;
            this.itemDtos = TODOS;
          });
        });
      }
    },
    watch: {
      'todoId'(id) {
        this.$router.push({name: 'todo', params: {id: id}});  //  监听到用户点击todoId的变化再跳转路由
      }
    },
    computed: {
      todoList(){
        return this.$store.getters.getTodoList;
      }
    }
  };
</script>
<style lang="less">
  @import '../common/style/menu.less';
</style>
