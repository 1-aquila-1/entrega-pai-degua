package com.entregapaidegua.webapi.api.v1.model;

import com.googlecode.jmapper.annotations.JMap;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpresaDadoPessoalModel {
    @JMap
    private String nome;
}
