package com.entregapaidegua.webapi.controller;

import com.entregapaidegua.entity.Empresa;
import com.entregapaidegua.interfaces.service.IEmpresaService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    public EmpresaController(IEmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    private IEmpresaService empresaService;
    
    @PostMapping(produces = "application/json")
    public ResponseEntity<Empresa> cadastrar(@RequestBody Empresa empresa) throws Exception{
        try{
            empresaService.cadastrar(empresa);
            return ResponseEntity.ok(empresa);
        }catch(Exception ex){
            throw new Exception(ex);
        }
    }

    @PutMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<Empresa> editar(@PathVariable Long id, @RequestBody Empresa empresa) throws Exception{
        empresaService.editar(id, empresa);
        return ResponseEntity.ok(empresa);
    }
}
