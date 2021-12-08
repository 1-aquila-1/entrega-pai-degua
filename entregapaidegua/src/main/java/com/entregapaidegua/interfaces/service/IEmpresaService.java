package com.entregapaidegua.interfaces.service;

import com.entregapaidegua.entity.Empresa;
import com.entregapaidegua.entity.auxiliar.Contato;
import com.entregapaidegua.entity.auxiliar.EmpresaDadoPessoal;
import com.entregapaidegua.entity.auxiliar.Endereco;

import org.springframework.stereotype.Service;

@Service
public interface IEmpresaService extends IBaseService<Empresa, Long>{
    void atualizarEndereco(Long id, Endereco endereco) throws Exception;
    void atualizarDadoPessoal(Long id, EmpresaDadoPessoal dadoPessoal) throws Exception;
    void atualizarContato(Long id, Contato contato) throws Exception;
}
