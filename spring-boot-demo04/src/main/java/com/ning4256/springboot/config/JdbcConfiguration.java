package com.ning4256.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * jdbc配置类
 */
@Configuration
//@PropertySource("classpath:/jdbc.properties")
//指定加载那个属性类
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfiguration {

//    @Autowired
//    private JdbcProperties jdbcProperties;

    //实例化druid
    @Bean
    public DataSource getDataSource(JdbcProperties jdbcProperties) {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
        dataSource.setUrl(jdbcProperties.getUrl());
        dataSource.setUsername(jdbcProperties.getUsername());
        dataSource.setPassword(jdbcProperties.getPassword());
        return dataSource;

    }
}
