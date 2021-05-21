package com.entregapaidegua.domain.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EnderecoVO implements Serializable {
    private String uf;
    private String cidade;
    private String bairro;
    private Integer cep;
    private String rua;
    private String numero;
    private String complemento;
}
