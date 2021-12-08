package com.entregapaidegua.entity.auxiliar;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class EmpresaDadoPessoal {
    private String nome;
    @Column(name="documento_fiscal")
    private String documentoFiscal;
}
