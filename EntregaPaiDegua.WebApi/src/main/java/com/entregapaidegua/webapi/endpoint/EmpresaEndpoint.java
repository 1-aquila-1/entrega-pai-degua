package com.entregapaidegua.webapi.endpoint;

import com.entregapaidegua.domain.vo.EmpresaVO;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cadastro/empresa")
public class EmpresaEndpoint {
    
    @PostMapping
    public ResponseEntity<EmpresaVO> cadastrar(){
        return ResponseEntity.ok(new EmpresaVO(1L, "A1"));
    }

    @PutMapping("{/id}")
    public ResponseEntity<EmpresaVO> editar(){
        return ResponseEntity.ok(new EmpresaVO(1L, "A1"));
    }
}
