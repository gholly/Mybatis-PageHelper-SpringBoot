package com.test.pageHelper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by guanguan on 2017/8/1.
 */
@SpringBootApplication
@ComponentScan("com.test.pageHelper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }

}
