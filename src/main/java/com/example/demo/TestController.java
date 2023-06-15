package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private RainInterface rainInterface;
    @GetMapping("/cc")
    public void getRain(){
        Rain rain = rainInterface.getRain();
        System.out.println("cccccccc" + rain.getId());
    }
}
