package com.atgui.springcloud;

import com.atgui.springcloud.entities.Payment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: HASEE
 * @ClassName: PaymentMain8001.java
 * @JdkVersion: JDK11.0
 * @Date: 2022/2/28
 * @Description: TODO(注释信息内容)
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class,args);
    }
}
