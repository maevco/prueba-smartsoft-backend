package com.smartsoft.prueba.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartsoft.prueba.entity.Producto;
import com.smartsoft.prueba.service.ProductoServiceDecl;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/producto/")
public class ProductoControler {

	@Autowired
	private ProductoServiceDecl productoService;

	@GetMapping
	private List<Producto> listar() {
		return productoService.getAllProducto();
	}

	@GetMapping(path = { "/{id}" })
	private Producto buscarProductoPorId(@PathVariable("id") Long id) {
		return productoService.findById(id);
	}

}
