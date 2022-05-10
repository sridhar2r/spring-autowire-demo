package com.example.springautowiredemo.comp;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Created by sridharrajagopal on 5/10/22.
 */
@Component
public class C {
    @Getter
    @Setter
    private int x;
    public C() {
        System.out.println("C");
        x = 100;
    }
}
