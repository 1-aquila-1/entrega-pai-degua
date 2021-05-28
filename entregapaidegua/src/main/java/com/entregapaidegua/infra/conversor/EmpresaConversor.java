package com.entregapaidegua.infra.conversor;

import com.entregapaidegua.entity.Empresa;
import com.entregapaidegua.interfaces.conversor.IEmpresaConversor;
import com.entregapaidegua.vo.EmpresaVO;
import com.entregapaidegua.vo.EnderecoVO;

public class EmpresaConversor implements IEmpresaConversor {

    @Override
    public EmpresaVO entityParaVO(Empresa obj) {
        return new EmpresaVO(obj.getId(), obj.getNome(), obj.getDocumentoFiscal(), 
        new EnderecoVO(
            obj.getUf(), 
            obj.getCidade(), 
            obj.getBairro(), 
            obj.getCep(), 
            obj.getRua(), 
            obj.getNumero(), 
            obj.getComplemento()));
    }

    @Override
    public Empresa voParaEntity(EmpresaVO obj) {
        var endereco = obj.getEndereco();
        return new Empresa(
            obj.getNome(), 
            obj.getDocumentoFiscal(), 
            endereco.getUf(), 
            endereco.getCidade(), 
            endereco.getBairro(), 
            endereco.getCep(), 
            endereco.getRua(), 
            endereco.getNumero(), 
            endereco.getComplemento());
    }
    
}
