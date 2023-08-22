package com.sancrisxa.conceitomulte.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "paginas")
@AllArgsConstructor
@NoArgsConstructor
public class Pagina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Nonnull
    private String conteudo;
    @Nonnull
    private Integer numeroPagina;

    @ManyToOne(fetch = FetchType.EAGER,  cascade=CascadeType.ALL)
    @JoinColumn(name="id_capitulo")
    private Capitulo capitulo;
}
