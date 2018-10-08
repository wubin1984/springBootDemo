package com.huipu;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
//@RestController
//@EnableAutoConfiguration
@RequestMapping("/file")
public class FileController {
	 
	
     @RequestMapping("/name")
     public String word() {
       return "file name...";
     }
    
}
