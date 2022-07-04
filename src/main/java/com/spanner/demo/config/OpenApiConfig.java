package com.spanner.demo.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
@Configuration
public class OpenApiConfig {
  

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("HELLO EMPLOYEE")
                        .description("Employee Portal Rest API (REDOC)")
                        .version("v1.0")
                        .contact(new Contact()
                                .name("Mayuresh Ratnaparkhi")
                                .url("https://docs.spring.io/spring-cloud-gcp/docs/current/reference/html/index.html#getting-started")
                                .email("mayureshratnaparkhi@gmail.com")                                
                                )
                        		
                        .termsOfService("TOC")
                        .license(new License().name("Mayuresh R.").url("#"))
                        
                );
    }
}