package com.wu.springboot_student_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
@MapperScan("com.wu")
public class SpringbootStudentDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStudentDemoApplication.class, args);
    }

}
