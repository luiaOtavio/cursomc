package com.perata.luiz.resolces;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.perata.luiz.Domain.Categoria;
import com.perata.luiz.Repsoitorys.CategoriasRepository;
import com.perata.luiz.Service.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriasResolces {
	@Autowired
	private CategoriaService service;
	
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
}
