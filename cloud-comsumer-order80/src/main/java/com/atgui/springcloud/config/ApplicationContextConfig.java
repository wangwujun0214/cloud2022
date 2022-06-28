package com.atgui.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: HASEE
 * @ClassName: ApplicationContextConfig.java
 * @JdkVersion: JDK11.0
 * @Date: 2022/3/7
 * @Description: TODO(注释信息内容)
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
