package com.perata.luiz.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perata.luiz.Domain.Categoria;
import com.perata.luiz.Repsoitorys.CategoriasRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriasRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null); 
	}	
	
}
