package com.entregapaidegua.domain.entity;

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
public class ItemVenda extends Entidade {
    private Produto produto;
    private Integer quantidade;
}
