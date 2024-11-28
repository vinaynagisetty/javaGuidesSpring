package com.vinaynagisetty.javaguidespringproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


@GetMapping ("/greeting")
public String Greeting(){
    return "Hello there how are you";
}
}
