package com.desafio.indicadorfilmes.filme.infra;

import com.desafio.indicadorfilmes.filme.application.service.ClimaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "climaClient", url = "${indicadorfilmes.clima.server}", configuration = ClimaClientConfiguration.class)
public interface ClimaFeignClient {
    @GetMapping("/weather")
    ClimaDTO buscaClima(@RequestParam("lat") String latitude,
                        @RequestParam("lon") String longitude);
}
