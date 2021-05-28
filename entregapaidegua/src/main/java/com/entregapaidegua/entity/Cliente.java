package com.entregapaidegua.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "cliente")
public class Cliente extends Entidade{
    private String nome;
    @Column(name = "data_nascimento")
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
