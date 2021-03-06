package fr.univ.orleans.interop.demoservices1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DemoServices1Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoServices1Application.class, args);
    }

}
