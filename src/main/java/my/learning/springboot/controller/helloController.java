package my.learning.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {

    @RequestMapping("/sayHello")
    @ResponseBody
    String sayHello(){
        return "Hello World from Spring boot application - Maven build";
    }

}
