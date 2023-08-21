package com.sancrisxa.conceitomulte.Dto;

import com.sancrisxa.conceitomulte.model.Capitulo;
import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
public class LivroDto {

    private Long id;
    @Nonnull
    private String titulo;
    @Nonnull
    private String autor;
    @Nonnull
    private String editora;
    @Nonnull
    private List<CapituloDto> capitulos;
}
