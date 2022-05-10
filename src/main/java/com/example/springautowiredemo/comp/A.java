package com.example.springautowiredemo.comp;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sridharrajagopal on 5/10/22.
 */
public class A {
    @Getter
    @Setter
    @Autowired
    private C c;
    public A() {
        System.out.println("A");
    }
}
