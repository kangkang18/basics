package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.boot.web.servlet.error.ErrorController;

@Controller
public class Hello {
    @RequestMapping("/hello")
    @ResponseBody
    String hi(){
        return  "Hello, World";
    }
    @RequestMapping("/bye")
    @ResponseBody
    String bye(){
        return "bye bye";
    }
    @RequestMapping("/error")
    public String handleError() {
        // 返回您自定义的错误信息或错误页面
        return "An error occurred.";
    }

}
