import axios from 'axios';
import {AxiosRequestConfig} from "axios/index";

const URL = "http://localhost:9000";

// 列出所有的todo内容
export const getTodoList = params => {
  return axios.get(URL + '/todo/list', {params: params})
};
export const addTodo = params => {
  return axios.post(URL + '/todo/add', params).then(res => res.data);
};

export const getTodo = params => {
  return axios.get(URL + '/todo/detail/' + params.id);
};
// 新增一个亲求新增代办单项的接口
export const addRecord = params => {
  return axios({
    method: 'post',
    url: URL + '/todo/addRecord/' + params.id,
    headers: {
      'Content-Type': 'application/json',  // 设置请求头信息
    },
    data: params.text,
  }).then(res => res.data);
};
export const editTodo = params => {
  return axios({
    method: 'post',
    url: URL + '/todo/editTodo',
    headers: {
      'Content-Type': 'application/json',  // 设置请求头信息
    },
    data: params.todo
  }).then(res => res.data);
};

// 更新代办单项
export const editRecord = params => {
  console.log(params);
  console.log(params.item);
  return axios({
    method: 'post',
    url: URL + '/todo/editRecord',
    headers: {
      'Content-Type': 'application/json',  // 设置请求头信息
    },
    data: params.item
  })
};
