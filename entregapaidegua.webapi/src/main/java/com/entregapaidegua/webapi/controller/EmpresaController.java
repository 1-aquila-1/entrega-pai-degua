package com.entregapaidegua.webapi.controller;

import com.entregapaidegua.vo.EmpresaVO;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cadastro/empresa")
public class EmpresaController {
    
    @PostMapping
    public ResponseEntity<EmpresaVO> cadastrar(){
        return ResponseEntity.ok(new EmpresaVO());
    }

    @PutMapping("{/id}")
    public ResponseEntity<EmpresaVO> editar(){
        return ResponseEntity.ok(new EmpresaVO());
    }
}
