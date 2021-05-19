package com.entregapaidegua.interfaces.service;

import com.entregapaidegua.entity.Produto;
import com.entregapaidegua.vo.ProdutoVO;

import org.springframework.stereotype.Service;

@Service
public interface IProdutoService extends IBaseService<ProdutoVO, Long> {
    
}
