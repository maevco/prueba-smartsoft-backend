package com.smartsoft.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartsoft.prueba.entity.Producto;
import com.smartsoft.prueba.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoServiceDecl {

	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public List<Producto> getAllProducto() {
		return productoRepository.findAll();
	}

	@Override
	public Producto findById(long id) {
		return productoRepository.findById(id);
	}

}
