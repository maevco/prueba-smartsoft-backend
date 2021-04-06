package com.smartsoft.prueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartsoft.prueba.entity.Factura;
import com.smartsoft.prueba.repository.FacturaRepository;

@Service
public class FacturaServiceImpl implements FacturaServiceDecl{

	@Autowired
	private FacturaRepository facturaRepository; 

	@Override
	public Factura add(Factura factura) {		
		return facturaRepository.save(factura);
	}

}
