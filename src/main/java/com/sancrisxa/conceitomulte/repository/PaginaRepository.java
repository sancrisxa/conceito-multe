package com.sancrisxa.conceitomulte.repository;

import com.sancrisxa.conceitomulte.model.Pagina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaginaRepository extends JpaRepository<Pagina, Long> {

    @Query(
            value = "SELECT * FROM paginas p WHERE p.id_capitulo = ?1",
            nativeQuery = true)
    List<Pagina> findAllByIdCapitulo(Long idCapitulo);
}
