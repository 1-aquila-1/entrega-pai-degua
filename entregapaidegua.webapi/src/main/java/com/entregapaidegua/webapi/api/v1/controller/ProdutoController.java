package com.entregapaidegua.webapi.api.v1.controller;

import com.entregapaidegua.interfaces.service.IProdutoService;
import com.entregapaidegua.vo.ProdutoVO;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/produto")
public class ProdutoController {
    
    private IProdutoService produtoService;

    public ProdutoController(IProdutoService produtoService){
        this.produtoService = produtoService;
    }

    @PostMapping(path = "/", produces = "application/json")
    public ResponseEntity<ProdutoVO> cadastrar(){
        try{
        //   return ResponseEntity.ok(produtoService.obter(1L));
            produtoService.obter(1L);
            return null;
        }catch(Exception e){
        }
        return ResponseEntity.ok(new ProdutoVO());
    }

    @PutMapping(path = "/", produces = "application/json")
    public String editar(){
        return "";
    }
}
