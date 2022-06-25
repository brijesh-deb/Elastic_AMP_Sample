package com.elasticapm;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/normal")
    public String getSuperFastApi() {

        return "Normal call, without any  delay";
    }

    @GetMapping("/slow")
    public String getFastApi() throws InterruptedException {

        Thread.sleep(100);
        return "Delayed by 100 ms";
    }

    @GetMapping("/veryslow")
    public String getSlowApi() throws InterruptedException {

        Thread.sleep(4000);
        return "Delayed by 4000 ms";
    }

}