package com.entregapaidegua.webapi.controller;

import com.entregapaidegua.entity.Empresa;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
    
    @PostMapping(produces = "application/json")
    public ResponseEntity<Empresa> cadastrar(){
        return ResponseEntity.ok(new Empresa());
    }

    @PutMapping(path = "/{/id}", produces = "application/json")
    public ResponseEntity<Empresa> editar(){
        return ResponseEntity.ok(new Empresa());
    }
}
