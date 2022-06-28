package com.atgui.springcloud.entities;

/**
 * @author: HASEE
 * @ClassName: Payment.java
 * @JdkVersion: JDK11.0
 * @Date: 2022/3/21
 * @Description: TODO(注释信息内容)
 */
public class Payment {
    private Long id;
    private String serial;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", serial='" + serial + '\'' +
                '}';
    }
}
