package com.smartsoft.prueba.service;

import java.util.List;

import com.smartsoft.prueba.entity.Cliente;

public interface ClienteServiceDecl {
	

	/**
	 * 
	 * @return
	 */
	public List<Cliente> getAllCliente();

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Cliente findById(long id);

}
