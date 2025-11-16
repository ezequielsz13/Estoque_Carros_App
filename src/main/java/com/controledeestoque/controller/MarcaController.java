package com.controledeestoque.controller;

import com.controledeestoque.model.Marca;
import com.controledeestoque.services.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/marcas")
public class MarcaController {
    @Autowired
    private MarcaService marcaService;

    //Endpoint
    @GetMapping("/listarMarcas")
    public List<Marca> listarMarcas(){
        return marcaService.listarMarcas();
    }
}
