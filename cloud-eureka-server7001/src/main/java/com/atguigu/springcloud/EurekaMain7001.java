package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: HASEE
 * @ClassName: EurekaMain7001.java
 * @JdkVersion: JDK11.0
 * @Date: 2022/4/17
 * @Description: TODO(注释信息内容)
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class,args);
    }
}
