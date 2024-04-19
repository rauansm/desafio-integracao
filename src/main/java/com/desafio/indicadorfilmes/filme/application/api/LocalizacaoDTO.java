package com.desafio.indicadorfilmes.filme.application.api;

import lombok.*;

@Getter
@ToString
@Builder
public class LocalizacaoDTO {
   private String longitude;
   private String latitude;
}
