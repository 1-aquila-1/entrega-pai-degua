package com.entregapaidegua.service;

import com.entregapaidegua.entity.Produto;
import com.entregapaidegua.interfaces.repository.IProdutoRepository;
import com.entregapaidegua.interfaces.service.IProdutoService;

import org.springframework.stereotype.Service;

@Service
public class ProdutoService extends BaseService<Produto, Long> implements IProdutoService{

    public ProdutoService(IProdutoRepository repositorio) {
        super(repositorio);
        this.produtoRepo = repositorio;
    }

    private IProdutoRepository produtoRepo;

    @Override
    public void editar(Long id, Produto entity) throws Exception {
        var prod = produtoRepo.findById(id);
        if(!prod.isPresent()){
            throw new Exception("Produdo não encontrado para atualização");
        }
        produtoRepo.save(prod.get().atualizar(entity));
    }
}
