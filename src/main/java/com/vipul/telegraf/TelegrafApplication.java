package com.vipul.telegraf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TelegrafApplication {

    public static void main(String[] args) {
        SpringApplication.run(TelegrafApplication.class);
    }

    @GetMapping
    public String applicationStatus() {
        return "Working!!";
    }

}
//http://localhost:8080/myapp/manage/jolokia/read/java.lang:type=Memory/HeapMemoryUsage