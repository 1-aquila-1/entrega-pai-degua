package com.entregapaidegua.webapi.api.v1.model;

import com.googlecode.jmapper.annotations.JMap;



import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpresaRequestModel {

    @JMap
    @ApiModelProperty(example = "1", position = 1)
    private Long id;
    @JMap
    @ApiModelProperty(example = "Lider", position = 2)
    private String nome;
    @JMap
    @ApiModelProperty(example = "25136589654785", position = 3)
    private String documentoFiscal;
    @JMap
    @ApiModelProperty(position = 4)
    private EnderecoModel endereco;
}
