package com.entregapaidegua.interfaces.conversor;

import org.springframework.stereotype.Component;

@Component
public interface IConversor<TEntidade, VM> {
    TEntidade vmToEntidade(VM objeto);
    VM entidadeToVM(TEntidade objeto);
}
