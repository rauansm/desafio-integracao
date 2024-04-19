package com.desafio.indicadorfilmes.filme.application.service;

import com.desafio.indicadorfilmes.filme.application.api.FilmeResponseData;
import com.desafio.indicadorfilmes.filme.domain.FilmeCategoria;

import java.util.List;

public interface FilmeClient {
    List<FilmeResponseData.FilmeResponse> buscaAtravesCategoria(FilmeCategoria categoria);
}
