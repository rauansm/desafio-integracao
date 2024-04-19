package com.desafio.indicadorfilmes.filme.infra;

import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClimaClientConfiguration {

    private String apiKey;
    private String units;

    @Bean
    public RequestInterceptor climaFeignRequestInterceptor() {
        return template -> template.query("appid", apiKey)
                .query("units", units);
    }

    @Autowired
    public void setApiKey(@Value("${indicadorfilmes.clima.apikey}") String apiKey) {
        this.apiKey = apiKey;
    }
    @Autowired
    public void setUnits(@Value("${indicadorfilmes.clima.units}") String units) {
        this.units = units;
    }
}

