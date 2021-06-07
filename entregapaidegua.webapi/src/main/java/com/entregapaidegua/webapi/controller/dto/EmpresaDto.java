package com.entregapaidegua.webapi.controller.dto;

import java.io.Serializable;

import com.googlecode.jmapper.annotations.JMap;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class EmpresaDto implements Serializable {
    @JMap
    @ApiModelProperty(example = "Lider", position = 2)
    private String nome;
    @JMap
    @ApiModelProperty(example = "12345678963", position = 3)
    private String documentoFiscal;
    @JMap
    @ApiModelProperty(position = 4)
    private EnderecoDto endereco;
}
