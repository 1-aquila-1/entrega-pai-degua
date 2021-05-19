package com.entregapaidegua.domain.interfaces.service;

import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IBaseService<T, ID> {
    void cadastro(T o) throws Exception;
    T obter(ID id) throws Exception;
    T editar(ID id, T o) throws Exception;
}
