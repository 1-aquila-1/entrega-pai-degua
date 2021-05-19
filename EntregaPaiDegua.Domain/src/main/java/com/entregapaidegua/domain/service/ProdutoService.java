package com.entregapaidegua.domain.service;

import java.util.Optional;

import com.entregapaidegua.domain.entity.Produto;
import com.entregapaidegua.domain.interfaces.repository.IProdutoRepository;
import com.entregapaidegua.domain.interfaces.service.IProdutoService;
import com.entregapaidegua.domain.vo.ProdutoVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService implements IProdutoService{

    private IProdutoRepository produtoRepo;

    @Autowired
    public ProdutoService(IProdutoRepository produtoRepo) {
        this.produtoRepo = produtoRepo;
    }

    @Override
    public void cadastro(ProdutoVO o) throws Exception {
    }

    @Override
    public ProdutoVO obter(Long id) throws Exception {
        Optional<Produto> obj = produtoRepo.findById(id);
        if(!obj.isPresent()){

        }
        var produto = new ProdutoVO(1L, "Teste");
        return produto;
    }

    @Override
    public ProdutoVO editar(Long id, ProdutoVO o) throws Exception {
        return null;
    }
    
}
