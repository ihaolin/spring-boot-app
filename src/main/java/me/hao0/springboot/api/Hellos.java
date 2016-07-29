package me.hao0.springboot.api;

import me.hao0.springboot.jdbc.HelloDao;
import me.hao0.springboot.redis.HelloRedis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Properties;

/**
 * Author: haolin
 * Date:   7/19/16
 * Email:  haolin.h0@gmail.com
 */
@Controller
public class Hellos {

    @Autowired
    private HelloDao helloDao;

    @Autowired
    private HelloRedis helloRedis;

    @RequestMapping("/hello")
    public String hello(
            @RequestParam(value="name", defaultValue="Spring Boot") String name, Model model){
        model.addAttribute("name", name);
        return "hello";
    }

    @RequestMapping("/hello2")
    @ResponseBody
    public String hello2(){
        return "hello2";
    }

    @RequestMapping("/select1")
    @ResponseBody
    public String select1(){
        helloDao.select1();
        return null;
    }

    @RequestMapping("/info")
    @ResponseBody
    public Properties info(){
        return helloRedis.info();
    }
}
