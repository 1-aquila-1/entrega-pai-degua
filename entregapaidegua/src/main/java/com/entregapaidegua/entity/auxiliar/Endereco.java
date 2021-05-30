package com.entregapaidegua.entity.auxiliar;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class Endereco {
    private String uf;
    private String cidade;
    private String bairro;
    private Integer cep;
    private String rua;
    private String numero;
    private String complemento;
}
