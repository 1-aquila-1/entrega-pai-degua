package com.entregapaidegua.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.entregapaidegua.entity.auxiliar.Endereco;

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
    @Embedded   
    private Endereco endereco;
}
