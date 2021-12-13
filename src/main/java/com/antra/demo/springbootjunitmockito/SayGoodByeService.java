package com.antra.demo.springbootjunitmockito;

import com.antra.demo.springbootjunitmockito.thirdParty.DemoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SayGoodByeService {

    private DemoClient demoClient;

    public SayGoodByeService(DemoClient demoClient) {
        this.demoClient = demoClient;
    }

    public String sayGoodBye() {
        return "GoodBye " + demoClient.getName();
    }
}
