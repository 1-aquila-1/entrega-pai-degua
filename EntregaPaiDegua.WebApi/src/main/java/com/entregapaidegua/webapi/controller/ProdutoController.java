package com.entregapaidegua.webapi.controller;


import com.entregapaidegua.domain.interfaces.service.IProdutoService;
import com.entregapaidegua.domain.vo.ProdutoVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private IProdutoService produtoService;

    @Autowired
    public ProdutoController(IProdutoService produtoService){
        this.produtoService = produtoService;
    }

    @PostMapping("/cadastro")
    public ResponseEntity<ProdutoVO> cadastrar(){
        try{
          return ResponseEntity.ok(produtoService.obter(1L));
        }catch(Exception e){
        }
        return ResponseEntity.ok(new ProdutoVO());
    }

    @PutMapping()
    public String editar(){
        return "";
    }
    
}
