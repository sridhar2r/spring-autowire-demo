package com.example.springautowiredemo.comp;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sridharrajagopal on 5/10/22.
 */
public class B {

    private A a;
    public B(A a) {
        System.out.println("B");
        this.a  = a;
    }
    public void printCDetail() {
        System.out.println(a.getC().getX());
    }
}
