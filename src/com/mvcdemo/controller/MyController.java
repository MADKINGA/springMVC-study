package com.mvcdemo.controller;

import com.mvcdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/study")
public class MyController {

    @RequestMapping(value = "/index")
    public @ResponseBody User study(@RequestParam("name") String name){
        User user=new User();
        user.setEmail("535220210@qq.com");
        user.setId("16219111418");
        user.setName(name);
        return user;
    }
}
