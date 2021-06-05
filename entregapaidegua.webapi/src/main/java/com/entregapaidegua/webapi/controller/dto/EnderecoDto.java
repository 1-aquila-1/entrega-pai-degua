package com.entregapaidegua.webapi.controller.dto;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class EnderecoDto implements Serializable{
    @ApiModelProperty(example = "PA", position = 1)
    private String uf;
    @ApiModelProperty(example = "Belém", position = 2)
    private String cidade;
    @ApiModelProperty(example = "Marco", position = 3)
    private String bairro;
    @ApiModelProperty(example = "123789", position = 4)
    private Integer cep;
    @ApiModelProperty(example = "Av. Almirante Barroso", position = 5)
    private String rua;
    @ApiModelProperty(example = "23", position = 6)
    private String numero;
    @ApiModelProperty(example = "Próximo ao bosque", position = 7)
    private String complemento;
}
