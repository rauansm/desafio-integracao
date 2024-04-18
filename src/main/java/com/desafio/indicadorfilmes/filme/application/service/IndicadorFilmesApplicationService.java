package com.desafio.indicadorfilmes.filme.application.service;

import com.desafio.indicadorfilmes.filme.application.api.FilmeResponse;
import com.desafio.indicadorfilmes.filme.application.api.LocalizacaoDTO;
import com.desafio.indicadorfilmes.filme.domain.FilmeCategoria;
import com.desafio.indicadorfilmes.filme.infra.FilmeCategoriaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
@Log4j2
public class IndicadorFilmesApplicationService implements IndicadorFilmesService {
    private final ClimaClient climaClient;
    private final FilmeCategoriaRepository filmeCategoriaRepository;
//    private final FilmeClient filmeClient;

    @Override
    public List<FilmeResponse> buscaIndicacoesFilmes(LocalizacaoDTO localizacao) {
        log.info("[inicia] IndicadorFilmesApplicationService - buscaIndicacoesFilmes");
        log.info("[localizacao] {}",localizacao);
        ClimaDTO clima = climaClient.buscaClima(localizacao);
        FilmeCategoria categoria = filmeCategoriaRepository.buscaAtravesTemperatura(clima.getTemperatura());
//        List<FilmeResponse> filmes = filmeClient.buscaAtravesCategoria(categoria);
        log.info("[finaliza] IndicadorFilmesApplicationService - buscaIndicacoesFilmes");
        return null;
    }
}
