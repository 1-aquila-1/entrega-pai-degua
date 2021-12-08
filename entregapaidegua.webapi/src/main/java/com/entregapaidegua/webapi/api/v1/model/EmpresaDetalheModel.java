package com.entregapaidegua.webapi.api.v1.model;

import com.googlecode.jmapper.annotations.JMap;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EmpresaDetalheModel {
    @JMap("${dadoPessoal.nome}")
    private String nome;
    @JMap("${dadoPessoal.documentoFiscal}")
    private String documentoFiscal;
    @JMap
    private ContatoModel contato;
    @JMap
    private EnderecoModel endereco;
}
