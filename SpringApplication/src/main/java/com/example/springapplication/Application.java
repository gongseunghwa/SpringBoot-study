package com.example.springapplication;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        //서블릿이 있으면 무조건 서블릿으로 동작 웹플럭스만 들어있다 -> WebApplicationType.REACTIVE로 돌아간다
        // 만약 둘다 들어있는데 WEBFLUX로 돌아가고 싶으면 위와 같이 설정할 수 있다.
        app.setWebApplicationType(WebApplicationType.SERVLET);

        app.run(args);







    }
}
