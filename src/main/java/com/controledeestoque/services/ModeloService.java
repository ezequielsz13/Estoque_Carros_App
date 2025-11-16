package com.controledeestoque.services;

import com.controledeestoque.model.Modelo;
import com.controledeestoque.repository.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeloService {
    @Autowired
    private ModeloRepository modeloRepository;

    public List<Modelo> listarModelos() {
        return modeloRepository.findAll();
    }
}
