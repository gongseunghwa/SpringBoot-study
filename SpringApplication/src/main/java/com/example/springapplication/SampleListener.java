package com.example.springapplication;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//이 이벤트는 ApplicationContext가 만들어지기 전에 발생하기 때문에 @Component를 붙여도 인식하지 못한다!! -> 리스너가 동작하지 않는다.
@Component
public class SampleListener implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("======================+");
        System.out.println("Application is started");
        System.out.println("======================+");

    }
}
