package com.antra.demo.springbootjunitmockito;

import org.springframework.stereotype.Service;

@Service
public class SayHelloService {

    public String sayHelloTo(String name) {
        return "Hello " + name;
    }
}
