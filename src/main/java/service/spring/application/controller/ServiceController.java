package service.spring.application.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ServiceController {

	@PostMapping("hello")
    public String helloHandler () {
        return "<h1>Hello World!</h1>";
    }
}
