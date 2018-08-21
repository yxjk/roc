package com.yxjk.diip.model;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@Data
public class Response<T> {
    @Valid
    private Object data;
    @NotBlank
    private String msg;
    @NotBlank
    private String status;

    private long total;

    public Response() {
        this.status = "S";
        this.msg = "操作成功";
    }

    public Response(Object data) {
        this.status = "S";
        this.msg = "操作成功";
        this.data = data;
        this.total = null != data ? 1 : 0;
    }

    public Response(Object data,long total) {
        this.status = "S";
        this.msg = "操作成功";
        this.data = data;
        this.total = total;
    }

    public Response(String status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
        this.total = null != data ? 1 : 0;
    }
    public Response(String status, String msg, Object data, long total) {
        this.status = status;
        this.msg = msg;
        this.total = total;
        this.data = data;
        this.total = total;
    }
}
