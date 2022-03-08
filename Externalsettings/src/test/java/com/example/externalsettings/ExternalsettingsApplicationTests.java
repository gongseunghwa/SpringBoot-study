package com.example.externalsettings;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.assertThat;


class ExternalsettingsApplicationTests {
    @Autowired
    Environment environment;
    @Test
    void contextLoads() {


    }

}
