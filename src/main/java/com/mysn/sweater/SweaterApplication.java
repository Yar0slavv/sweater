package com.mysn.sweater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
public class SweaterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SweaterApplication.class, args);

    }

}
