package com.entregapaidegua.domain.entity;

import java.util.Date;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Cliente extends Entidade{
    private String nome;
    private Date dataNascimento;
    private Integer telefone;

    private String uf;
    private String cidade;
    private String bairro;
    private Integer cep;
    private String rua;
    private String numero;
    private String complemento;
    
}
