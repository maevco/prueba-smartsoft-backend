package com.smartsoft.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartsoft.prueba.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	

	/**
	 * 
	 * @return
	 */
	public List<Cliente> findAll();

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Cliente findById(long id);


}
