package com.demo.demoproj;

import com.demo.demoproj.benchmark.Bench;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;


@SpringBootApplication
public class DemoProjApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoProjApplication.class, args);
    }
}
