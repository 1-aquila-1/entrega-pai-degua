package com.entregapaidegua.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "produto")
public class Produto extends Entidade{
    private String nome;
    private BigDecimal preco;
    private String descricao;
    @ManyToOne
    private Empresa empresa;
}
