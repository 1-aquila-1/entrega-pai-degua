package com.entregapaidegua.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.entregapaidegua.entity.auxiliar.Contato;
import com.entregapaidegua.entity.auxiliar.EmpresaDadoPessoal;
import com.entregapaidegua.entity.auxiliar.Endereco;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "empresa")
public class Empresa extends Entidade {

    @Embedded
    private EmpresaDadoPessoal dadoPessoal;
    @Embedded
    private Contato contato;
    @Embedded
    private Endereco endereco;

    public Empresa addEndereco(Endereco endereco) {
        setEndereco(endereco);
        return this;
    }

    public Empresa addDadoPessoal(EmpresaDadoPessoal dadoPessoal) {
        dadoPessoal.setNome(dadoPessoal.getNome());
        return this;
    }

    public Empresa addContato(Contato contato) {
        setContato(contato);
        return this;
    }

    public String getNome() {
        return dadoPessoal.getNome();
    }

}
