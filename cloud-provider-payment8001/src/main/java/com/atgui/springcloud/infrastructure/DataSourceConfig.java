package com.atgui.springcloud.infrastructure;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: HASEE
 * @ClassName: DataSourceConfig.java
 * @JdkVersion: JDK11.0
 * @Date: 2023/3/23
 * @Description: TODO(注释信息内容)
 */
@Configuration
@MapperScan(basePackages = "",sqlSessionFactoryRef = "")
public class DataSourceConfig {

}
