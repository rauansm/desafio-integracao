package com.desafio.indicadorfilmes.filme.application.service;

import com.desafio.indicadorfilmes.filme.application.api.LocalizacaoDTO;

public interface ClimaClient {
    ClimaDTO buscaClima(LocalizacaoDTO localizacao);
}
