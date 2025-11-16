package com.controledeestoque.repository;

import com.controledeestoque.model.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModeloRepository extends JpaRepository<Modelo, Integer> {
}
