package com.entregapaidegua.interfaces.conversor;

import com.entregapaidegua.entity.Empresa;
import com.entregapaidegua.vo.EmpresaVO;

import org.mapstruct.Mapper;

@Mapper
public interface IEmpresaConversor {
    EmpresaVO entityParaVO(Empresa obj);
    Empresa voParaEntity(EmpresaVO obj);
}
