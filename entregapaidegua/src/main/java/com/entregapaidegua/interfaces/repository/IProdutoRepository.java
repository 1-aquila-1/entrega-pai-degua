package com.entregapaidegua.interfaces.repository;

import com.entregapaidegua.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IProdutoRepository extends JpaRepository<Produto, Long> {
    
}
