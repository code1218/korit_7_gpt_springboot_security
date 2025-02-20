package com.korit.springboot_security.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI getOpenAPI() {
        OpenAPI openAPI = new OpenAPI();
        openAPI.info(getInfo());
        return openAPI;
    }

    private Info getInfo() {
        Info info = new Info();
        info.title("Spring Boot 시큐리티 수업");
        info.version("1.0.0");
        info.description("시큐리티 수업 내용입니다.");
        info.contact(getContact());
        return info;
    }

    private Contact getContact() {
        Contact contact = new Contact();
        contact.name("김준일");
        contact.email("skjil1218@kakao.com");
        return contact;
    }

}
