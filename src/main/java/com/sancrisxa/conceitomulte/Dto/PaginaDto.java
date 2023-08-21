package com.sancrisxa.conceitomulte.Dto;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Builder
@Component
@AllArgsConstructor
@NoArgsConstructor
public class PaginaDto {

    private Long id;
    @Nonnull
    private String conteudo;
    @Nonnull
    private Integer numeroPagina;
}
