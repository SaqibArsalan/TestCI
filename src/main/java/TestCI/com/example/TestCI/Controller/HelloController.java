package TestCI.com.example.TestCI.Controller;

import TestCI.com.example.TestCI.HelloService.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hello")
public class HelloController {
//    private final HelloService helloService;
//
//    @Autowired
//    public HelloController(HelloService helloService) {
//        this.helloService = helloService;
//    }

    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String getGreeting() {
        return "Hello World!!";
    }
}
