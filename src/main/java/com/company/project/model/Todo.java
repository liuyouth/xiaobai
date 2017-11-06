package com.company.project.model;

import javax.persistence.*;

public class Todo {
    @Id
    @Column(name = "todo_id")
    private Integer todoId;

    @Column(name = "todo_title")
    private String todoTitle;

    @Column(name = "todo_type")
    private String todoType;

    @Column(name = "create_time")
    private String createTime;

    @Column(name = "action_time")
    private String actionTime;

    @Column(name = "todu_info")
    private String toduInfo;

    /**
     * @return todo_id
     */
    public Integer getTodoId() {
        return todoId;
    }

    /**
     * @param todoId
     */
    public void setTodoId(Integer todoId) {
        this.todoId = todoId;
    }

    /**
     * @return todo_title
     */
    public String getTodoTitle() {
        return todoTitle;
    }

    /**
     * @param todoTitle
     */
    public void setTodoTitle(String todoTitle) {
        this.todoTitle = todoTitle;
    }

    /**
     * @return todo_type
     */
    public String getTodoType() {
        return todoType;
    }

    /**
     * @param todoType
     */
    public void setTodoType(String todoType) {
        this.todoType = todoType;
    }

    /**
     * @return create_time
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * @return action_time
     */
    public String getActionTime() {
        return actionTime;
    }

    /**
     * @param actionTime
     */
    public void setActionTime(String actionTime) {
        this.actionTime = actionTime;
    }

    /**
     * @return todu_info
     */
    public String getToduInfo() {
        return toduInfo;
    }

    /**
     * @param toduInfo
     */
    public void setToduInfo(String toduInfo) {
        this.toduInfo = toduInfo;
    }
}