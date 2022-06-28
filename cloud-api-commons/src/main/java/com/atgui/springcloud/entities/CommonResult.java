package com.atgui.springcloud.entities;

/**
 * @author: HASEE
 * @ClassName: CommonResult.java
 * @JdkVersion: JDK11.0
 * @Date: 2022/3/21
 * @Description: TODO(注释信息内容)
 */
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(){

    }

    public CommonResult(T data){
        this.data = data;
    }
    public CommonResult(Integer code, String message, T data){
        this.data = data;
        this.code = code;
        this.message = message;
    }
    public CommonResult(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
