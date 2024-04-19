package com.desafio.indicadorfilmes.filme.infra;

import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilmeClientConfiguration {
    private String token;

    @Bean
    public RequestInterceptor filmeFeignRequestInterceptor() {
        return template -> template.header("Authorization", token);
    }

    @Autowired
    public void setToken(@Value("${indicadorfilmes.filme.token}") String token) {
        this.token = token;
    }
}
