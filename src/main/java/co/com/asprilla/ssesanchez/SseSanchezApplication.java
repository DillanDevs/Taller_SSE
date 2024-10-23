package co.com.asprilla.ssesanchez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SseSanchezApplication {

    public static void main(String[] args) {
        SpringApplication.run(SseSanchezApplication.class, args);
    }

}
