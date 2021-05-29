package com.entregapaidegua.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "venda")
public class Venda extends Entidade{
    
    @Column(name="nome_cliente")
    private String nomeCliente;
    @Column(name="valor_total")
    private BigDecimal valorTotal;
    @Column(name = "endereco_entrega")
    private String enderecoEntrega;
    @Column(name="data_venda")
    private Date dataVenda;
    @ManyToOne(fetch = FetchType.EAGER)
    private SituacaoVenda situacao;

    @ManyToOne(fetch = FetchType.LAZY)
    private Cliente cliente;
    @ManyToOne(fetch = FetchType.LAZY)
    private Empresa empresa;
}
