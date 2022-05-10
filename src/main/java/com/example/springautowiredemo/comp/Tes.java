package com.example.springautowiredemo.comp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Created by sridharrajagopal on 5/10/22.
 *
 */

/**
 With @Component A bean is initialized first, and then when new B(getA()) is called getA method is called and
 another instance of A is created. In otherwords B is getting a new A object which is out of the spring context
 So A gets C by autowiring. This happens properly when we have @Configuration, C component will be loaded
 into application context and it will be autowired to A. Later when B bean is initialized getA method will
 not be called and we will get A bean from spring context with C bean autowired into A.
 But with @Component annotation we will be calling getA method again, and new instance of A will be created manually
 and it will not have C bean autowired to it. So we will get null pointer exception if we try to invoke
 getA().getC().getX() from any method inside B bean.
 http://dimafeng.com/2015/08/29/spring-configuration_vs_component/
 */
//@Component
    @Configuration
public class Tes {
    @Bean
    public A getA() {
        System.out.println("Inside A bean creation");
        return new A();
    }

    @Bean
    public B getB() {
        System.out.println("Inside B bean creation");
        return new B(getA());
    }
}
