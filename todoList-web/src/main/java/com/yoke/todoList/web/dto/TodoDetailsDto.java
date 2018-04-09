package com.yoke.todoList.web.dto;

import java.io.Serializable;

/**
 * @author Yoke
 * Created on 2018/4/9
 */
public class TodoDetailsDto implements Serializable {
    private Integer id;
    private String title;
    private Integer count;
    private Boolean isDelete;
    private Boolean locked;

    public TodoDetailsDto(Integer id, String title, Integer count, Boolean isDelete, Boolean locked) {
        this.id = id;
        this.title = title;
        this.count = count;
        this.isDelete = isDelete;
        this.locked = locked;
    }

    public TodoDetailsDto() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    @Override
    public String toString() {
        return "TodoDetailsDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", count=" + count +
                ", isDelete=" + isDelete +
                ", locked=" + locked +
                '}';
    }
}
