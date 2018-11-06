package com.srx.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.srx.blog.mapper")
public class SrxblogserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SrxblogserviceApplication.class, args);
    }
}
