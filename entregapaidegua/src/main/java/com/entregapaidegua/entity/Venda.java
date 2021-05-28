package com.entregapaidegua.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = "venda_produto")
public class Venda extends Entidade{
    private BigDecimal valorTotal;
    @Column(name = "endereco_entrega")
    private String enderecoEntrega;
    @ManyToOne
    private Cliente cliente;
    @Column(name="data_venda")
    private Date dataVenda;
    @Enumerated(EnumType.STRING)
    private SituacaoVenda situacao;
}
