package com.entregapaidegua.service;

import com.entregapaidegua.entity.Empresa;
import com.entregapaidegua.interfaces.repository.IEmpresaRepository;
import com.entregapaidegua.interfaces.service.IEmpresaService;

import org.springframework.stereotype.Service;

@Service
public class EmpresaService extends BaseService<Empresa, Long> implements IEmpresaService{

    public EmpresaService(IEmpresaRepository empresaRepository) {
        super(empresaRepository);
        this.empresaRepository = empresaRepository;
    }

    private IEmpresaRepository empresaRepository;

    @Override
    public void editar(Long id, Empresa entity) throws Exception {
        var obj = empresaRepository.findById(id);
        if(!obj.isPresent()){
            throw new Exception("Sem registro para atualizar");
        }
        empresaRepository.save(obj.get().atualizar(entity));
    }
    
}
