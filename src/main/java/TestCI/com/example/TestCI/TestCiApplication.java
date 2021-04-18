package TestCI.com.example.TestCI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TestCiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestCiApplication.class, args);
	}

}
