package com.entregapaidegua.webapi.api.v1.model;

import com.googlecode.jmapper.annotations.JMap;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpresaResponseModel  {
    @JMap
    @ApiModelProperty(example = "1", position = 1)
    private Long id;
    @JMap
    @ApiModelProperty(example = "Lider", position = 2)
    private String nome;
}
