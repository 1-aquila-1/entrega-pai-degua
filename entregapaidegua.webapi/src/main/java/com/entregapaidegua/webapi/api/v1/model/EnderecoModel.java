package com.entregapaidegua.webapi.api.v1.model;

import com.googlecode.jmapper.annotations.JMap;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EnderecoModel {
    @JMap
    private String uf;
    @JMap
    private String cidade;
    @JMap
    private String bairro;
    @JMap
    private Integer cep;
    @JMap
    private String rua;
    @JMap
    private String numero;
    @JMap
    private String complemento;
}
