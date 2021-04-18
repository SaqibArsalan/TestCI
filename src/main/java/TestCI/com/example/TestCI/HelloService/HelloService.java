package TestCI.com.example.TestCI.HelloService;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getGreeting() {
        return "Hello World!!";
    }
}
