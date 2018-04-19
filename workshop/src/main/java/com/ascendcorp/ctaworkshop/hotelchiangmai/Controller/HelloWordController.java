package com.ascendcorp.ctaworkshop.hotelchiangmai.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloworld() {
        return "Hello test";
    }
}
