package com.example.snacksback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication(exclude= {SecurityAutoConfiguration.class })
@EnableOpenApi
//@MapperScan("com.example.snacksback.mapper")
public class SnacksBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnacksBackApplication.class, args);
    }

}
