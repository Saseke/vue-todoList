import {
  getTodoList
} from '../api/api';

// 提交EDITTODE，列出所有的todo
export const getTodo = ({commit}) => {
  return new Promise((resolve) => {
    getTodoList().then(res => {
      commit('EDITTODE', res.data.todos);
      resolve();
    });
  });
};

// 提交MENUOPEN，更改菜单是否打开的值
export const updateMenu = ({commit}) => {
  commit('MENUOPEN');
};
