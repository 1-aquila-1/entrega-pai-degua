package com.entregapaidegua.webapi.controller.dto;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class EmpresaDto implements Serializable {
    @ApiModelProperty(example = "Lider", position = 2)
    private String nome;
    @ApiModelProperty(example = "12345678963", position = 3)
    private String documentoFiscal;
    @ApiModelProperty(position = 4)
    private EnderecoDto endereco;
}
