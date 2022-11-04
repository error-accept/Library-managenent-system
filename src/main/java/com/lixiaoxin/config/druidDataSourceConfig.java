package com.lixiaoxin.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class druidDataSourceConfig {
    String url="jdbc:mysql://localhost:3306/lib_db?serverTimezone=UTC";
    String Driver="com.mysql.cj.jdbc.Driver";
    String user="lixiaoxin";
    String passwd="l3004007788xx";
//    @Bean
//    public DataSource getDataaSource(){
//        DruidDataSource druidDataSource = new DruidDataSource();
//        druidDataSource.setUrl(url);
//        druidDataSource.setDriverClassName(Driver);
//        druidDataSource.setUsername(user);
//        druidDataSource.setPassword(passwd);
//        return druidDataSource;
//    }
}
