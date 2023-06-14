package com.oscar.springboothelloworld.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    // e.g.
    // localhost:8080/greeting?name=oscar
    // Data Binding: (request parameters: query parameters or form data)
    // use @RequestParam to bind a query parameter to a formal parameter in a controller

    // What if we have 2 and more query parameters?
    // e.g.
    // localhost:8080/greeting?name=oscar&age=30
    // use property --> name = "query_parameter_name"
    // Is it mandatory?
    // use property --> required = true / false
    // Does it come with a default value?
    // use property --> defaultValue = value

    @GetMapping("/greeting")
    public String greet(@RequestParam(name = "name", required = false, defaultValue = "World") String name) {
        return "Hello " + name + "!";
    }

}
