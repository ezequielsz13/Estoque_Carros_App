package com.controledeestoque.services;

import com.controledeestoque.model.Situacao;
import com.controledeestoque.repository.SituacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SituacaoService {
    @Autowired
    private SituacaoRepository situacaoRepository;

    public List<Situacao> listarSituacoes() {
        return situacaoRepository.findAll();
    }
}
