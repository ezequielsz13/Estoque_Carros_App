package com.controledeestoque.repository;

import com.controledeestoque.model.Situacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SituacaoRepository extends JpaRepository<Situacao, Integer> {
}
