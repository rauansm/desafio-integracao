package com.desafio.indicadorfilmes.filme.application.api;

import com.desafio.indicadorfilmes.filme.application.service.IndicadorFilmesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/sugestoes")
public class IndicadorFilmesAPI {
    private final IndicadorFilmesService indicadorFilmesService;
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public List<FilmeResponseData.FilmeResponse> indicaFilmes(@RequestParam String longitude, @RequestParam String latitude) {
        log.info("[inicia] IndicadorFilmesAPI - indicaFilmes");
        log.info("[longitude] {} - [latitude] {}",longitude,latitude);
        var localizacao = LocalizacaoDTO.builder()
                .longitude(longitude)
                .latitude(latitude)
                .build();
        var filmes = indicadorFilmesService.buscaIndicacoesFilmes(localizacao);
        log.info("[finaliza] IndicadorFilmesAPI - indicaFilmes");
    return filmes;
    }
}

