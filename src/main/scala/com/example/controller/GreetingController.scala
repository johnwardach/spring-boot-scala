package com.example.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam

@RestController
@RequestMapping(value=Array("/greeting"))
class HelloWorldController {
  
  @RequestMapping(method=Array(RequestMethod.GET))
  def sayHello(@RequestParam("name") name: String): String = {
    return s"Hello, $name"
  }
  
}