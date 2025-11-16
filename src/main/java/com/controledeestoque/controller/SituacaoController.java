package com.controledeestoque.controller;

import com.controledeestoque.model.Situacao;
import com.controledeestoque.services.SituacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/situacoes")
public class SituacaoController {
    @Autowired
    private SituacaoService situacaoService;

    //Endpoint
    @GetMapping("/listarSituacoes")
    public List<Situacao>  listarSituacoes() {
        return situacaoService.listarSituacoes();
    }
}
