package com.example.orchestra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class OrchestraApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(OrchestraApplication.class, args);
    }

}
