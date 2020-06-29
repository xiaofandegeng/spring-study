//package com.ning4256.springboot.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
///**
// * jdbc配置类
// */
//@Configuration
////@PropertySource("classpath:/jdbc.properties")
////指定加载那个属性类
////@EnableConfigurationProperties(JdbcProperties.class)
//public class JdbcConfiguration1 {
//
////    @Autowired
////    private JdbcProperties jdbcProperties;
//
//    //实例化druid
//    @Bean
//    @ConfigurationProperties(prefix = "jdbc")
//    public DataSource getDataSource() {
//        DruidDataSource dataSource = new DruidDataSource();
//        return dataSource;
//
//    }
//}
