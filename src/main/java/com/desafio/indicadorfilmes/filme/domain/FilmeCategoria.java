package com.desafio.indicadorfilmes.filme.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.UUID;
@Getter
@Entity
public class FilmeCategoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
    private UUID id;
    @Enumerated(EnumType.STRING)
    private FilmeCategoriaEnum categoria;
    private Double temperaturaMinima;
    private Double temperaturaMaxima;
}
