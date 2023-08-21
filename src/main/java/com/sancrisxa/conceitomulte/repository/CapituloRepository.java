package com.sancrisxa.conceitomulte.repository;

import com.sancrisxa.conceitomulte.model.Capitulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CapituloRepository extends JpaRepository<Capitulo, Long> {
    @Query(
            value = "SELECT * FROM capitulos c WHERE c.id_livro = ?1",
            nativeQuery = true)
    List<Capitulo> findByIdLivro(Long id);
}
