package tcastrovillari.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ProducerApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProducerApplication.class, args);
    }
}
