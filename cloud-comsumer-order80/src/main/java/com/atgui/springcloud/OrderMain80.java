package com.atgui.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.text.SimpleDateFormat;

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
//        String io = "";
//        String ddd = io.substring(io.indexOf("@")+1);
//        io = io.substring(0,io.indexOf("@"));
//        int length = io.length();
//        String replace = io.substring(io.indexOf("(")+1,io.indexOf("(")+2);
//        StringBuffer sb = new StringBuffer(replace);
//        int i = Integer.parseInt(replace);
//        int i1 = ++i;
//        System.out.println(i1);
//        sb.append("日");
//        sb.setCharAt(sb.lastIndexOf("-"),'月');
//        sb.setCharAt(sb.lastIndexOf("-"),'年');
//        System.out.println(sb+(length+""));
//

    }
}
