package com.entregapaidegua.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
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
@Table(name="item_venda")
public class ItemVenda extends Entidade {
    
    private String descricao;
    @Column(name = "preco_unitario")
    private BigDecimal precoUnitario;
    private Integer quantidade;
    @ManyToOne(fetch = FetchType.LAZY)
    private Produto produto;
    @ManyToOne(fetch = FetchType.LAZY)
    private Venda venda;
}
