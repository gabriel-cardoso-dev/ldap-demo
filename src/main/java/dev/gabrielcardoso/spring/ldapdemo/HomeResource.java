package dev.gabrielcardoso.spring.ldapdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String index() {
        return "<h1>HELLO</h1>";
    }

}
