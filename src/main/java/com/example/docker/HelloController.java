package com.example.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yuriy on 2017-01-19.
 * All rights reserved at PrimeMethod Inc. 2017
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring + Docker!!!";
    }
}
