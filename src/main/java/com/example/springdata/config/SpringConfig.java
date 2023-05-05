package com.example.springdata.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class SpringConfig{
    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI().info(new Info().title("Mirzeyev Elnur")
                .version("0.0.1")
                .description("blog sayti")
                .contact(new Contact().url("/api/users").email("elnurmirzyev96@gmail.com").name("Mirzeyev Elnur")));

    }
}
