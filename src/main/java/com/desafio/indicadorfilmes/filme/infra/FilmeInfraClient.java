package com.desafio.indicadorfilmes.filme.infra;

import com.desafio.indicadorfilmes.filme.application.api.FilmeResponseData;
import com.desafio.indicadorfilmes.filme.application.service.FilmeClient;
import com.desafio.indicadorfilmes.filme.domain.FilmeCategoria;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@RequiredArgsConstructor
@Log4j2
public class FilmeInfraClient implements FilmeClient {
    private final FilmeFeignClient filmeFeignClient;

    @Override
    public List<FilmeResponseData.FilmeResponse> buscaAtravesCategoria(FilmeCategoria categoria) {
        log.info("[inicia] FilmeInfraClient - buscaAtravesCategoria");
        log.info("[categoria] {}", categoria.getCategoria());
        FilmeResponseData filmes = filmeFeignClient.buscaFilmeAtravesCategoriaId(categoria.getCategoria().getIdGeneroFilme());
        log.info("[finaliza] FilmeInfraClient - buscaAtravesCategoria");
        return filmes.getResults();
    }
}
