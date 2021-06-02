package com.entregapaidegua.interfaces.service;

import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IBaseService<T, ID> {
    void cadastrar(T entity) throws Exception;
    T obter(ID id) throws Exception;
    void editar(ID id, T entity) throws Exception;
}
