package com.example.externalsettings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(SampleRunner.class);

    @Autowired
    SeunghwaProperties seunghwaProperties;


    @Autowired
    private String hello;

    @Value("${seunghwa.name}")
    String name;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        logger.debug("============================");
        logger.debug(hello);
        logger.debug(seunghwaProperties.getName());
        logger.debug(seunghwaProperties.getFullName());
        logger.debug("============================");


//        System.out.println("====================");
//        System.out.println(seunghwaProperties.getName());
//        System.out.println(seunghwaProperties.getFullName());
//        System.out.println(hello);
//        System.out.println("====================");


    }
}
