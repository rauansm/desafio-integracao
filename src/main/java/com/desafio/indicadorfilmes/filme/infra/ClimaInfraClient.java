package com.desafio.indicadorfilmes.filme.infra;

import com.desafio.indicadorfilmes.filme.application.api.LocalizacaoDTO;
import com.desafio.indicadorfilmes.filme.application.service.ClimaClient;
import com.desafio.indicadorfilmes.filme.application.service.ClimaDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Log4j2
@RequiredArgsConstructor
public class ClimaInfraClient implements ClimaClient {
    private final ClimaFeignClient climaFeignClient;

    @Override
    public ClimaDTO buscaClima(LocalizacaoDTO localizacao) {
        log.info("[inicia] ClimaInfraClient - buscaClima");
        ClimaDTO clima = climaFeignClient.buscaClima(localizacao.getLatitude(), localizacao.getLongitude());
        log.info("clima {}", clima.getTemperatura());
        log.info("[finaliza] ClimaInfraClient - buscaClima");
        return clima;
    }
}
