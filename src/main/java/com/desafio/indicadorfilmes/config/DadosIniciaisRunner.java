package com.desafio.indicadorfilmes.config;

import com.desafio.indicadorfilmes.filme.domain.FilmeCategoria;
import com.desafio.indicadorfilmes.filme.domain.FilmeCategoriaEnum;
import com.desafio.indicadorfilmes.filme.infra.FilmeCategoriaSpringDataJPA;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DadosIniciaisRunner implements ApplicationRunner {
    private final FilmeCategoriaSpringDataJPA filmeCategoriaRepository;

    @Override
    public void run(ApplicationArguments args) {
        Long quantidadeRegistros = filmeCategoriaRepository.contarRegistros();
        if (quantidadeRegistros == 0) {
            filmeCategoriaRepository.save(new FilmeCategoria(FilmeCategoriaEnum.ACAO, 40.1, Double.MAX_VALUE));
            filmeCategoriaRepository.save(new FilmeCategoria(FilmeCategoriaEnum.COMEDIA, 36.0, 40.0));
            filmeCategoriaRepository.save(new FilmeCategoria(FilmeCategoriaEnum.ANIMACAO, 20.0, 35.0));
            filmeCategoriaRepository.save(new FilmeCategoria(FilmeCategoriaEnum.SUSPENSE, 0.0, 20.0));
            filmeCategoriaRepository.save(new FilmeCategoria(FilmeCategoriaEnum.DOCUMENTARIO, Double.MIN_VALUE, -1.0));
        }
    }
}
