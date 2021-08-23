package com.entregapaidegua.webapi.api.v1.conversor;

import com.entregapaidegua.entity.Empresa;
import com.entregapaidegua.interfaces.conversor.ConversorMVC;
import com.entregapaidegua.webapi.api.v1.model.EmpresaRequestModel;
import com.entregapaidegua.webapi.api.v1.model.EmpresaResponseModel;
import com.googlecode.jmapper.JMapper;

import org.springframework.stereotype.Component;

@Component
public class EmpresaConversor extends  ConversorMVC<Empresa, EmpresaRequestModel, EmpresaResponseModel>{

    public EmpresaConversor() {
        super();
    }

    @Override
    public void inicializar() {
        usarConversorRequestAndEntity(new JMapper<>(EmpresaRequestModel.class, Empresa.class), new JMapper<>(Empresa.class, EmpresaRequestModel.class));
    }


    
}
