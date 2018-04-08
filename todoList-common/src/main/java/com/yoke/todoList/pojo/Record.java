package com.yoke.todoList.pojo;

import java.io.Serializable;

public class Record implements Serializable {
    private Integer id;

    private Byte isdelete;

    private Byte checked;

    private Integer todoId;

    private String text;

    private static final long serialVersionUID = 1L;

    public Record(Integer id, Byte isdelete, Byte checked, Integer todoId) {
        this.id = id;
        this.isdelete = isdelete;
        this.checked = checked;
        this.todoId = todoId;
    }

    public Record(Integer id, Byte isdelete, Byte checked, Integer todoId, String text) {
        this.id = id;
        this.isdelete = isdelete;
        this.checked = checked;
        this.todoId = todoId;
        this.text = text;
    }

    public Record() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Byte isdelete) {
        this.isdelete = isdelete;
    }

    public Byte getChecked() {
        return checked;
    }

    public void setChecked(Byte checked) {
        this.checked = checked;
    }

    public Integer getTodoId() {
        return todoId;
    }

    public void setTodoId(Integer todoId) {
        this.todoId = todoId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Record other = (Record) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()))
            && (this.getChecked() == null ? other.getChecked() == null : this.getChecked().equals(other.getChecked()))
            && (this.getTodoId() == null ? other.getTodoId() == null : this.getTodoId().equals(other.getTodoId()))
            && (this.getText() == null ? other.getText() == null : this.getText().equals(other.getText()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        result = prime * result + ((getChecked() == null) ? 0 : getChecked().hashCode());
        result = prime * result + ((getTodoId() == null) ? 0 : getTodoId().hashCode());
        result = prime * result + ((getText() == null) ? 0 : getText().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", checked=").append(checked);
        sb.append(", todoId=").append(todoId);
        sb.append(", text=").append(text);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}