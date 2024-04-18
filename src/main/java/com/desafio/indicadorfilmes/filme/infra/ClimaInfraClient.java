package com.desafio.indicadorfilmes.filme.infra;

import com.desafio.indicadorfilmes.filme.application.api.LocalizacaoDTO;
import com.desafio.indicadorfilmes.filme.application.service.ClimaClient;
import com.desafio.indicadorfilmes.filme.application.service.ClimaDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
@RequiredArgsConstructor
public class ClimaInfraClient implements ClimaClient {
    private final ClimaFeignClient climaFeignClient;
    private String apiKey = "b0c5a158058aa6cdfb3bab2246530cf2";

    @Override
    public ClimaDTO buscaClima(LocalizacaoDTO localizacao) {
        log.debug("[inicia] ClimaInfraClient - buscaClima");
        log.debug("[localizacao] {}", localizacao);
        ClimaDTO clima = climaFeignClient.buscaClima(localizacao.getLatitude(),localizacao.getLongitude(),apiKey);
        log.info("clima {}", clima.getTemperatura());
        log.debug("[finaliza] ClimaInfraClient - buscaClima");
        return null;
    }
}
