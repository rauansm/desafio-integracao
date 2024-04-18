package com.desafio.indicadorfilmes.filme.application.service;

import com.desafio.indicadorfilmes.filme.application.api.FilmeResponse;
import com.desafio.indicadorfilmes.filme.domain.FilmeCategoria;

import java.util.List;

public interface FilmeClient {
    List<FilmeResponse> buscaAtravesCategoria(FilmeCategoria categoria);
}
