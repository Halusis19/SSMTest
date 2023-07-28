package com.ssmtest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.ssmtest")
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableTransactionManagement   //启动事务
public class SpringConfig {
}
