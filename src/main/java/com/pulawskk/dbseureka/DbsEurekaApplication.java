package com.pulawskk.dbseureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DbsEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbsEurekaApplication.class, args);
    }

}
