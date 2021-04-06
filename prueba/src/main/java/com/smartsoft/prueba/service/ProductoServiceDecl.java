package com.smartsoft.prueba.service;

import java.util.List;

import com.smartsoft.prueba.entity.Producto;

public interface ProductoServiceDecl {

	/**
	 * 
	 * @return
	 */
	public List<Producto> getAllProducto();

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Producto findById(long id);

}
