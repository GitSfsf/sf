package com.sf.server;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sf.server.mapper")
public class sf_oomApplication {
    public static void main(String[] args) {
        SpringApplication.run(sf_oomApplication.class,args);
    }
}
