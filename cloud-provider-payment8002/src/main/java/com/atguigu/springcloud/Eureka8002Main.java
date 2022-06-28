package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: HASEE
 * @ClassName: Eureka8002Main.java
 * @JdkVersion: JDK11.0
 * @Date: 2022/5/8
 * @Description: TODO(注释信息内容)
 */
@SpringBootApplication
@EnableEurekaClient
public class Eureka8002Main {
    public static void main(String[] args) {
        SpringApplication.run(Eureka8002Main.class,args);
    }
}
