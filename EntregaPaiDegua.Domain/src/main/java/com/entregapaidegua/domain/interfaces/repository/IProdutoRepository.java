package com.entregapaidegua.domain.interfaces.repository;

import com.entregapaidegua.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IProdutoRepository extends JpaRepository<Produto, Long> {
    
}
