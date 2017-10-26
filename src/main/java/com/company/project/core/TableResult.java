package com.company.project.core;

import com.alibaba.fastjson.JSON;

/**
 * Created by mgxc2 on 2017/9/17.
 */
public class TableResult {
    private int code;
    private String message;
    private Object data;
    private long count;

    public TableResult setCode(ResultCode resultCode) {
        this.code = resultCode.code;
        return this;
    }

    public int getCode() {
        return code;
    }

    public TableResult setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public TableResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public TableResult setData(Object data) {
        this.data = data;
        return this;
    }

    public long getCount() {
        return count;
    }

    public TableResult setCount(long count) {
        this.count = count;
        return this;
    }


    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
