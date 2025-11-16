package com.controledeestoque.controller;


import com.controledeestoque.model.Modelo;
import com.controledeestoque.services.ModeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/modelos")
public class ModeloController {
    @Autowired
    private ModeloService modeloService;

    //Endpoint
    @GetMapping("/listarModelos")
    public List<Modelo> listarMarcas() { return modeloService.listarModelos();
    }
}
