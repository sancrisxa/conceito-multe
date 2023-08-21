package com.sancrisxa.conceitomulte.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@Entity
@Table(name = "capitulos")
@AllArgsConstructor
@NoArgsConstructor
public class Capitulo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Nonnull
    private String titulo;
    @Nonnull
    private Integer numeroCapitulo;

    @ManyToOne(fetch = FetchType.EAGER,  cascade=CascadeType.ALL)
    @JoinColumn(name="id_livro")
    private Livro livro;

    @OneToMany(mappedBy = "capitulo", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Pagina> paginas;
}
