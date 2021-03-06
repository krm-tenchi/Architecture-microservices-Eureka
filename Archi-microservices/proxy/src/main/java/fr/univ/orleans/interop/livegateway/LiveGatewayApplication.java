package fr.univ.orleans.interop.livegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LiveGatewayApplication {

    public static void main(String[] args) { SpringApplication.run(LiveGatewayApplication.class, args);  }

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder buidler){
        return buidler.routes()
                .route(r->r.path("/api/service/**")
                    .filters(f->f.rewritePath("/api/service/(?<remains>)","/${remains}"))
                    .uri("lb://DEMO-SERVICE1/")

                )

                .route(r->r.path("/api/auth/**")
                        .filters(f->f.rewritePath("/api/auth/(?<remains>)","/${remains}"))
                        .uri("lb://DEMO-AUTH/")

                )
                .build();


    }




}
