package com.entregapaidegua.webapi.api.v1.controller;

import javax.validation.Valid;

import com.entregapaidegua.entity.Empresa;
import com.entregapaidegua.entity.auxiliar.Contato;
import com.entregapaidegua.entity.auxiliar.EmpresaDadoPessoal;
import com.entregapaidegua.entity.auxiliar.Endereco;
import com.entregapaidegua.interfaces.service.IEmpresaService;
import com.entregapaidegua.webapi.api.v1.model.ContatoModel;
import com.entregapaidegua.webapi.api.v1.model.EmpresaCadastroModel;
import com.entregapaidegua.webapi.api.v1.model.EmpresaCadastroResponseModel;
import com.entregapaidegua.webapi.api.v1.model.EmpresaDadoPessoalModel;
import com.entregapaidegua.webapi.api.v1.model.EmpresaDetalheModel;
import com.entregapaidegua.webapi.api.v1.model.EnderecoModel;
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
@RequestMapping(value = "/v1/empresas", produces = MediaType.APPLICATION_JSON_VALUE)
public class EmpresaController {

    @Autowired
    private IEmpresaService empresaService;
    @Autowired
    private JMapper<Empresa, EmpresaCadastroModel> modelToEntity;
    @Autowired
    private JMapper<EmpresaCadastroResponseModel, Empresa> entityToModel;
    @Autowired
    private JMapper<EmpresaDetalheModel, Empresa> empresaToDetalheModel;
    @Autowired
    private JMapper<EmpresaDadoPessoal, EmpresaDadoPessoalModel> modelToEmpresaDadoPessoal;
    @Autowired
    private JMapper<Endereco, EnderecoModel> modelToEndereco;
    @Autowired
    private JMapper<Contato, ContatoModel> modelToContato;

    @PostMapping
    public ResponseEntity<EmpresaCadastroResponseModel> cadastro(@RequestBody EmpresaCadastroModel empresaRequestModel)
            throws Exception {
        var empresa = modelToEntity.getDestination(empresaRequestModel);
        empresaService.salvar(empresa);
        return ResponseEntity.ok(entityToModel.getDestination(empresa));
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpresaDetalheModel> buscar(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok(empresaToDetalheModel.getDestination(empresaService.obter(id)));
    }

    @PutMapping("/{id}/atualizacao/endereco")
    public ResponseEntity<?> editarEndereco(@PathVariable Long id,
            @RequestBody @Valid EnderecoModel model) throws Exception {
        empresaService.atualizarEndereco(id, modelToEndereco.getDestination(model));
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}/atualizacao/dado-pessoal")
    public ResponseEntity<?> editarDadoPessoal(@PathVariable Long id,
            @RequestBody @Valid EmpresaDadoPessoalModel model) throws Exception {
        empresaService.atualizarDadoPessoal(id, modelToEmpresaDadoPessoal.getDestination(model));
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}/atualizacao/contato")
    public ResponseEntity<?> editarContato(@PathVariable Long id,
            @RequestBody @Valid ContatoModel model) throws Exception {
        empresaService.atualizarContato(id, modelToContato.getDestination(model));
        return ResponseEntity.ok().build();
    }
}
