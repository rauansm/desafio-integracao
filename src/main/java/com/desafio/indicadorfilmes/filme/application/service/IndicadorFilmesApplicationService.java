package com.desafio.indicadorfilmes.filme.application.service;

import com.desafio.indicadorfilmes.filme.application.api.FilmeResponse;
import com.desafio.indicadorfilmes.filme.application.api.LocalizacaoDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
@Log4j2
public class IndicadorFilmesApplicationService implements IndicadorFilmesService {
    @Override
    public List<FilmeResponse> buscaIndicacoesFilmes(LocalizacaoDTO localizacao) {
        log.info("[inicia] IndicadorFilmesApplicationService - buscaIndicacoesFilmes");
        log.info("[localizacao] {}",localizacao);

        log.info("[finaliza] IndicadorFilmesApplicationService - buscaIndicacoesFilmes");
        return null;
    }
}
