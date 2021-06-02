package com.entregapaidegua.service;

import java.util.Optional;

import com.entregapaidegua.entity.Entidade;
import com.entregapaidegua.interfaces.service.IBaseService;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class BaseService <T extends Entidade, ID> implements IBaseService<T, ID> {

    
    public BaseService(JpaRepository<T, ID> repositorio) {
        this.repositorio = repositorio;
    }
    
    private JpaRepository<T, ID> repositorio;

    @Override
    public void cadastrar(T entity) throws Exception {
      try{
        repositorio.save(entity);
      }catch(Exception ex){
          throw new Exception("Erro ao salvar", ex);
      }
    }

    @Override
    public T obter(ID id) throws Exception {
        Optional<T> entity = repositorio.findById(id);
        if(!entity.isPresent()){
            throw new Exception("Nenhuma informação foi encontrado");
        }
        return entity.get();
    }
    
}
