package com.entregapaidegua.webapi.api.v1.model;

import com.googlecode.jmapper.annotations.JMap;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContatoModel {
    @JMap
    private String email;
    @JMap
    private String celular;
    @JMap
    private String telefone; 
}
