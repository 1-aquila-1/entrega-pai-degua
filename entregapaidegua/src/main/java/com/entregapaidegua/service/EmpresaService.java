package com.entregapaidegua.service;

import com.entregapaidegua.entity.Empresa;
import com.entregapaidegua.entity.auxiliar.Contato;
import com.entregapaidegua.entity.auxiliar.EmpresaDadoPessoal;
import com.entregapaidegua.entity.auxiliar.Endereco;
import com.entregapaidegua.exception.NoResultException;
import com.entregapaidegua.interfaces.repository.IEmpresaRepository;
import com.entregapaidegua.interfaces.service.IEmpresaService;

import org.springframework.stereotype.Service;

@Service
public class EmpresaService extends BaseService<Empresa, Long> implements IEmpresaService {

    public EmpresaService(IEmpresaRepository empresaRepository) {
        super(empresaRepository);
    }

    @Override
    public void editar(Long id, Empresa entity) throws Exception {
        throw new Exception("Não implementado");
    }

    @Override
    public void atualizarEndereco(Long id, Endereco endereco) throws Exception {
        try {
            salvar(obter(id).addEndereco(endereco));
        } catch (NoResultException e) {
            throw new NoResultException("P01", "Não foi encontrado um registro de empresa para o código " + id);
        }
    }

    @Override
    public void atualizarDadoPessoal(Long id, EmpresaDadoPessoal dadoPessoal) throws Exception {
        try {
            salvar(obter(id).addDadoPessoal(dadoPessoal));
        } catch (NoResultException e) {
            throw new NoResultException("P01", "Não foi encontrado um registro de empresa para o código " + id);
        }
    }

    @Override
    public void atualizarContato(Long id, Contato contato) throws Exception {
        try {
            salvar(obter(id).addContato(contato));
        } catch (NoResultException e) {
            throw new NoResultException("P01", "Não foi encontrado um registro de empresa para o código " + id);
        }

    }

}
