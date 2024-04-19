package com.desafio.indicadorfilmes.filme.infra;

import com.desafio.indicadorfilmes.filme.application.api.FilmeResponseData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "filmeFeignClient", url = "${indicadorfilmes.filme.server}", configuration = FilmeClientConfiguration.class)
public interface FilmeFeignClient {

    @GetMapping("/3/discover/movie?include_adult=false&include_video=false&language=pt-BR&sort_by=popularity.desc")
    FilmeResponseData buscaFilmeAtravesCategoriaId(@RequestParam("with_genres") Integer categoriaId);
}
