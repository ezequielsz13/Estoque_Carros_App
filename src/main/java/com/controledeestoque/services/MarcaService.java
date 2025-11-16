package com.controledeestoque.services;

import com.controledeestoque.model.Marca;
import com.controledeestoque.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaService {
    @Autowired
    private MarcaRepository marcaRepository;

    public List<Marca> listarMarcas() {
        return marcaRepository.findAll();
    }
}
