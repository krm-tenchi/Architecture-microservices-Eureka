package fr.univ.orleans.interop.livediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LiveDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiveDiscoveryApplication.class, args);
    }

}
