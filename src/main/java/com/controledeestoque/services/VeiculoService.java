package com.controledeestoque.services;

import com.controledeestoque.model.Veiculo;
import com.controledeestoque.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {
    @Autowired
    private VeiculoRepository veiculoRepository;

    // Método para listar Veículos
    public List<Veiculo> listarVeiculos() {
        return veiculoRepository.findAll();
    }
}
