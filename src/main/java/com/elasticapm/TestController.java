package com.elasticapm;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/super-fast")
    public String getSuperFastApi() {

        return "Without any delay";
    }

    @GetMapping("/fast")
    public String getFastApi() throws InterruptedException {

        Thread.sleep(20); // sleep for 20 milliseconds
        return "With 20ms delay";
    }

    @GetMapping("/slow")
    public String getSlowApi() throws InterruptedException {

        Thread.sleep(3000); // sleep for 3 seconds
        return "With 3000 ms delay";
    }

}