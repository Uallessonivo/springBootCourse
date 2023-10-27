package com.uallessonivo.springbootcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {
                "com.uallessonivo.springbootcourse",
                "com.uallessonivo.util"
        }
)
public class SpringBootCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCourseApplication.class, args);
    }

}
