package com.entregapaidegua.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SituacaoVenda {
    SOLICITADO(0),
    AGUARDANDO_ENTREGA(1),
    CONFIRMADO_CLIENTE(2),
    CONFIRMADO_LOJA(3),
    CONFIRMADO_CLIENTE_LOJA(4);

    private int valor;
}
