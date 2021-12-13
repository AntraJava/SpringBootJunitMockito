package com.antra.demo.springbootjunitmockito.thirdParty;

import org.springframework.stereotype.Component;

@Component
public class DemoClientImpl implements DemoClient{

    public String getName() {
        return "real";
    }

}
