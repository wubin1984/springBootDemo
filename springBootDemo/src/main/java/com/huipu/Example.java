package com.huipu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 * wubin
 */
@SpringBootApplication(scanBasePackages = "com.huipu")
public class Example {

    @RequestMapping("/h")
    public String index() {
        return "hello word!";
    }
     
    public static void main( String[] args ){
       SpringApplication.run(Example.class, args);
       System.out.println( "Hello World ! App!" );
    }
}
