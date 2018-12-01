package com.hxxzt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.hxxzt.dao")
@SpringBootApplication
@ComponentScan(basePackages = {"com"})
public class QuartzApplication {

    public static void main(String[] args) {

        SpringApplication.run(QuartzApplication.class, args);
    }
}
