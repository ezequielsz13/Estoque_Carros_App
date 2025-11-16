package com.controledeestoque.services;

import com.controledeestoque.model.Tipo;
import com.controledeestoque.repository.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoService {
    @Autowired
    private TipoRepository tipoRepository;

    public List<Tipo> listarTipos() {
        return tipoRepository.findAll();
    }
}
