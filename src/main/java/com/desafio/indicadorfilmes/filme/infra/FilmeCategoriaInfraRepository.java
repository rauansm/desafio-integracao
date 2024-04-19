package com.desafio.indicadorfilmes.filme.infra;

import com.desafio.indicadorfilmes.filme.domain.FilmeCategoria;
import com.desafio.indicadorfilmes.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Log4j2
@RequiredArgsConstructor
public class FilmeCategoriaInfraRepository implements FilmeCategoriaRepository {
    private final FilmeCategoriaSpringDataJPA filmeCategoriaSpringDataJPA;
    @Override
    public FilmeCategoria buscaAtravesTemperatura(Double temperatura) {
        log.info("[inicia] FilmeCategoriaInfraRepository - buscaAtravesTemperatura");
        List<FilmeCategoria> categorias = filmeCategoriaSpringDataJPA.findByTemperaturaMinimaLessThanEqualAndTemperaturaMaximaGreaterThanEqual(temperatura, temperatura);
        log.info("[finaliza] FilmeCategoriaInfraRepository - buscaAtravesTemperatura");
        return categorias.stream().findFirst().orElseThrow(() -> APIException.recursoNaoEncontrado("Categoria Não Encontrada!"));
    }
}
