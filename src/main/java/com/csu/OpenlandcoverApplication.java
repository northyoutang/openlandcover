package com.csu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.csu.mapper")
public class OpenlandcoverApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenlandcoverApplication.class, args);
    }

}
