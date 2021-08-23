package com.entregapaidegua.webapi.api.v1.controller;

import com.entregapaidegua.entity.Empresa;
import com.entregapaidegua.interfaces.service.IEmpresaService;
import com.entregapaidegua.webapi.api.v1.conversor.EmpresaConversor;
import com.entregapaidegua.webapi.api.v1.model.EmpresaRequestModel;
import com.entregapaidegua.webapi.api.v1.model.EmpresaResponseModel;
import com.googlecode.jmapper.JMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/empresa", produces = MediaType.APPLICATION_JSON_VALUE)
public class EmpresaController {

    @Autowired
    private IEmpresaService empresaService;
    @Autowired
    private EmpresaConversor empresaConversor;

    
    @PostMapping
    public ResponseEntity<EmpresaResponseModel> cadastrar(@RequestBody EmpresaRequestModel empresaRequestModel) throws Exception{
        try{
            var empresa = empresaConversor.requestModelToEntity(empresaRequestModel);
            empresaService.cadastrar(empresa);
            return ResponseEntity.ok(empresaConversor.entityToResponseModel(empresa));
        }catch(Exception ex){
            throw new Exception(ex);
        }
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<EmpresaResponseModel> editar(@PathVariable Long id, @RequestBody EmpresaRequestModel empresaRequestModel) throws Exception{
        var empresa = empresaMapper.getDestination(empresaRequestModel);
        empresaService.editar(id, empresa);
        return ResponseEntity.ok(vmResponseMapper.getDestination(empresa));
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<EmpresaResponseModel> buscar(@PathVariable Long id) throws Exception{
        // var empresa = empresaMapper.getDestination(empresaRequestModel);
        // empresaService.b(id, empresa);
        return null;
    }
}
