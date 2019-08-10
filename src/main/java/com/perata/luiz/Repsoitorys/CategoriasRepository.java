package com.perata.luiz.Repsoitorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.perata.luiz.Domain.Categoria;

@Repository
public interface CategoriasRepository extends JpaRepository<Categoria, Integer>{
	
}
