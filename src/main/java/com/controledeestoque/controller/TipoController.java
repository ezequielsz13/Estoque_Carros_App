package com.controledeestoque.controller;

import com.controledeestoque.model.Tipo;
import com.controledeestoque.services.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/tipos")
public class TipoController {
    @Autowired
    private TipoService tipoService;

    //Endpoint
    @GetMapping("/listarTipos")
    public List<Tipo> listarTipos() {
        return tipoService.listarTipos();
    }
}
