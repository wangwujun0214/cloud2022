package com.atgui.springcloud;

import cn.hutool.json.JSON;
import com.atgui.springcloud.entities.Payment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author: HASEE
 * @ClassName: OrderMain80.java
 * @JdkVersion: JDK11.0
 * @Date: 2022/3/7
 * @Description: TODO(注释信息内容)
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
//        Payment payment = new Payment();
//        payment.setSerial("=======");
//        payment.setId((long)1520);
//        Map<String,Object> map = new HashMap<>();
//        Field[] fields = payment.getClass().getDeclaredFields();
//        for (int i=0;i<fields.length;i++) {
//            String varName = fields[i].getName();
//            boolean flag = fields[i].isAccessible();
//            fields[i].setAccessible(true);
//            Object var = fields[i].get(payment);
//            if (null != fields[i].get(payment)){
//                map.put(varName,var);
//            }
//            fields[i].setAccessible(flag);
//            System.out.println("field:"+fields[i].getName());
//        }
//        Payment payment = new Payment();
//        payment.setId((long)548);
//        String dfi = payment.getSerial();
//        System.out.println(dfi);
    }
}
