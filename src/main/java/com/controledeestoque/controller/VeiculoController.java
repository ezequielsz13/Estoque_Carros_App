package com.controledeestoque.controller;

import com.controledeestoque.model.Veiculo;
import com.controledeestoque.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

// Endpoint
    @GetMapping("/listarVeiculos")
    public List<Veiculo> listarVeiculos() {
        return veiculoService.listarVeiculos();
    }
}
