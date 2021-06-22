package org.shiloh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shiloh
 */
@SpringBootApplication
@RestController
public class TeamCityCiTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeamCityCiTestApplication.class, args);
    }

    @GetMapping("/greeting")
    public String greeting() {
        return "这是用TeamCity构建的项目哦";
    }

}
