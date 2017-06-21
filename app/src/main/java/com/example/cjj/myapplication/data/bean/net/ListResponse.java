package com.example.cjj.myapplication.data.bean.net;

import java.util.List;

/**
 * Created by yxm on 2017/6/21.
 */

public class ListResponse<T> {
    private List<T> data;
    private int code;
    private String message;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
