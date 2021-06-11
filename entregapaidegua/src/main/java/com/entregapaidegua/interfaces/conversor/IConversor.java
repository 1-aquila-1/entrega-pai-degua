package com.entregapaidegua.interfaces.conversor;

import org.springframework.stereotype.Component;

@Component
public interface IConversor<TEntidade, Dto> {
    TEntidade dtoToEntidade(Dto objeto);
    Dto entidadeToDto(TEntidade objeto);
}
