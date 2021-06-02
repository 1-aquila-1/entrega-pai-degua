package com.entregapaidegua.interfaces.repository;

import com.entregapaidegua.entity.Empresa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpresaRepository extends JpaRepository<Empresa, Long>{
}
