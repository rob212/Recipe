package com.woita.recipe.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mcbrydr on 27/09/19
 */
@RestController
@RequestMapping(value = "v1")
public class ApiController {
    @GetMapping(value = "/hello")
    public String helloWorld() {
        return "hello";
    }

}
