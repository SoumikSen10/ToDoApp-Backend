package com.project.todoapp.todoapplication.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins="http://localhost:5173")
@RestController
public class HelloWorldController 
{
   @GetMapping(path="/basicauth")
   public String basicAuthCheck()
   {
	   return "Success";
   }
   
   @GetMapping(path="/hello-world")
   public String helloWorld()
   {
	   return "Hello World v2";
   }
   
   @GetMapping(path="/hello-world-bean")
   public HelloWorldBean helloWorldBean()
   {
	   return new HelloWorldBean("Hello World Bean v1");
   }
   
   @GetMapping(path="/hello-world/path-variable/{name}")
   public HelloWorldBean helloWorldPathVariable(@PathVariable String name)
   {
	   return new HelloWorldBean(String.format("Hello World,%s", name));
   }
   
}
