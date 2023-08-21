package com.sancrisxa.conceitomulte.Dto;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Builder
@Component
@AllArgsConstructor
@NoArgsConstructor
public class CapituloDto {

    private Long id;
    @Nonnull
    private String titulo;
    @Nonnull
    private Integer numeroCapitulo;
    @Nonnull
    private List<PaginaDto> paginas;
}
