package com.mykhaylenko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by pavlo.mykhaylenko on 8/3/2015.
 */
@SpringBootApplication
@ComponentScan
@EnableJpaRepositories(basePackages = {"com.mykhaylenko"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
