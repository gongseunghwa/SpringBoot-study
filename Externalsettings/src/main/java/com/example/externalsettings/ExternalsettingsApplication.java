package com.example.externalsettings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(SeunghwaProperties.class)
public class ExternalsettingsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExternalsettingsApplication.class, args);

    }

}
