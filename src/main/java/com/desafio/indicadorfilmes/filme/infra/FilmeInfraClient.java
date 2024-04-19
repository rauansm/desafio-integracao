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
    private final String token = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJhZjM3ZGUzMzQ2YjM0ZmEyZjU1OWIyNzUxYTU1MWU3ZiIsInN1YiI6IjY0OTIyYTlkODUwMDVkMDBlODc3Njc0MiIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.E2VBsqmW7FLpDlWxO7KBJtxUS_fBfGMUojSGNToqK4I";

    @Override
    public List<FilmeResponseData.FilmeResponse> buscaAtravesCategoria(FilmeCategoria categoria) {
        log.info("[inicia] FilmeInfraClient - buscaAtravesCategoria");
        log.info("[categoria] {}", categoria.getCategoria());
        FilmeResponseData filmes = filmeFeignClient.buscaFilmeAtravesCategoriaId(categoria.getCategoria().getIdGeneroFilme(),token);
        log.info("[finaliza] FilmeInfraClient - buscaAtravesCategoria");
        return filmes.getResults();
    }
}
