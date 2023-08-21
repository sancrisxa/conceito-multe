package com.sancrisxa.conceitomulte.repository;

import com.sancrisxa.conceitomulte.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
}
