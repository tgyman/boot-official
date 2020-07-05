package com.tgy;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 */
@RestController//spring considers it when handling incoming web requests
@EnableAutoConfiguration//configure spring
public class Example {

    @RequestMapping("/")//provides "routing" information
    String home(){
        return "Hello World!";
    }

    public static void main(String[] args) {


//        SpringApplication.run(Example.class,args);

        SpringApplication app=new SpringApplication(Example.class);
//        //关闭banner
//        app.setBannerMode(Banner.Mode.OFF);
        //关闭命令行参数,实验时可以设置argument line为--server.port=8085
        app.setAddCommandLineProperties(false);
        app.run(args);
    }
}
