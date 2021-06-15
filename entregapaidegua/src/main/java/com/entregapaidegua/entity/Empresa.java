package com.entregapaidegua.entity;

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
@Table(name = "empresa")
public class Empresa extends Entidade{

    private String nome;
    @Column(name="documento_fiscal")
    private String documentoFiscal;
    @Embedded   
    private Endereco endereco;
    
   public Empresa atualizar(Empresa obj){
       setNome(obj.getNome());
       setEndereco(obj.getEndereco());
       return this;
   }
    
}
