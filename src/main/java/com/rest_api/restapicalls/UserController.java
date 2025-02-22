package com.rest_api.restapicalls;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //Method to return
    @GetMapping ("/hello")
    public String sayHello(){
        return "Hello from BridgeLabz";
    }

    //Method to return hello from Request Parameter
    //http://localhost:8080/query?name=tikesh
    @GetMapping("/query")
    public String sayHello(@RequestParam(defaultValue = "Tikesh") String name){
        return "Hello "+ name +" " + "from BridgeLabz";
    }

    //Method UC3 using the Path variable to return the message with name of the user
    //Use http://localhost:8080/display/name
    @GetMapping({"/display/{name}" , "/display"})
    public String DisplayHello(@PathVariable (required = false) String name){
        if (name == null){
            name = "Tikesh";
        }
        return "Hello "+name+ " from BridgeLabz!";
    }

}
