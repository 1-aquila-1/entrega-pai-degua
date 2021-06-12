package com.entregapaidegua.webapi.controller.viewmodel;

import java.io.Serializable;

import com.googlecode.jmapper.annotations.JMap;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class EnderecoVM implements Serializable{
    @JMap
    @ApiModelProperty(example = "PA", position = 1)
    private String uf;
    @JMap
    @ApiModelProperty(example = "Belém", position = 2)
    private String cidade;
    @JMap
    @ApiModelProperty(example = "Marco", position = 3)
    private String bairro;
    @JMap
    @ApiModelProperty(example = "123789", position = 4)
    private Integer cep;
    @JMap
    @ApiModelProperty(example = "Av. Almirante Barroso", position = 5)
    private String rua;
    @JMap
    @ApiModelProperty(example = "23", position = 6)
    private String numero;
    @JMap
    @ApiModelProperty(example = "Próximo ao bosque", position = 7)
    private String complemento;
}
