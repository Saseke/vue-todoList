package com.yoke.todoList.mapper;

import com.yoke.todoList.pojo.Todo;
import com.yoke.todoList.pojo.TodoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TodoMapper {
    long countByExample(TodoExample example);

    int deleteByExample(TodoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Todo record);

    int insertSelective(Todo record);

    List<Todo> selectByExample(TodoExample example);

    Todo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Todo record, @Param("example") TodoExample example);

    int updateByExample(@Param("record") Todo record, @Param("example") TodoExample example);

    int updateByPrimaryKeySelective(Todo record);

    int updateByPrimaryKey(Todo record);
}