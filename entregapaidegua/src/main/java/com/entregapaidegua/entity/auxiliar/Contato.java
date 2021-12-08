package com.entregapaidegua.entity.auxiliar;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Contato {
    private String email;
    private String celular;
    private String telefone;
}
