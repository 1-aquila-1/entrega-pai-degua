package com.entregapaidegua.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity(name="situacao_venda")
public class SituacaoVenda extends Entidade{
    private String situacao;
}
