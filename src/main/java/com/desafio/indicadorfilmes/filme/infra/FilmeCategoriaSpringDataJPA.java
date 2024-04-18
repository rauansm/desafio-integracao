package com.desafio.indicadorfilmes.filme.infra;

import com.desafio.indicadorfilmes.filme.domain.FilmeCategoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface FilmeCategoriaSpringDataJPA extends JpaRepository<FilmeCategoria, UUID> {
    List<FilmeCategoria> findByTemperaturaMinimaLessThanEqualAndTemperaturaMaximaGreaterThanEqual(Double temperatura, Double temperatura1);
}
