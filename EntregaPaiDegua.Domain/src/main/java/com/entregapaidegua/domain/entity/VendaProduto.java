package com.entregapaidegua.domain.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

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
public class VendaProduto extends Entidade{
    private BigDecimal valorTotal;
    private String enderecoEntegra;
    private Cliente cliente;
    private List<ItemVenda> itens;
    private Date dataOperacao;
    private SituacaoVenda situacao;
}
