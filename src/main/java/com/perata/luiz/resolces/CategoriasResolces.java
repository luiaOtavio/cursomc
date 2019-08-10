package com.perata.luiz.resolces;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriasResolces {
	@RequestMapping(method = RequestMethod.GET)
	public String lista() {return "Rest esta funcionado";}
	
	
}
