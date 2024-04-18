package com.desafio.indicadorfilmes.filme.application.api;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class LocalizacaoDTO {
    String longitude;
    String latitude;
}
