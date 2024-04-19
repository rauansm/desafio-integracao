package com.desafio.indicadorfilmes.filme.infra;

import com.desafio.indicadorfilmes.filme.domain.FilmeCategoria;

public interface FilmeCategoriaRepository {
    FilmeCategoria buscaAtravesTemperatura(Double temperatura);
}
