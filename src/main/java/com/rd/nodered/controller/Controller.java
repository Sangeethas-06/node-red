package com.rd.nodered.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
@PostMapping("/node-red/data")
public ResponseEntity<String> greetUser(@RequestBody User user ) {
             System.out.println(user.getName());
             System.out.println(user.getAge());
             return ResponseEntity.ok("Hello " + user.getName() + ", you are " + user.getAge() + " years old!" );
}
    @PostMapping("/node-red")
    public ResponseEntity<Boolean> greetUser(@RequestBody Boolean status ) {
        System.out.println(status);
        if(status==true)
        {
            return ResponseEntity.ok(true);
        }
        else
        return ResponseEntity.ok(false);
    }
    @PostMapping("/pubsub")
    public ResponseEntity<String> message(@RequestBody String user ) {
        System.out.println(user);
        return ResponseEntity.ok(user);
    }

public static class User {
      private String name;
      private int age;
     // private int status;
      public String getName() {

       return name;
 }
// public void setStatus(int status) {
//
//       this.status = status;
// }
//    public int getStatus() {
//
//        return status;
//    }
    public void setName(String name) {

        this.name = name;
    }
 public int getAge() {

       return age;
 }
public void setAge(int age) {

       this.age = age;
 }
 }
}
