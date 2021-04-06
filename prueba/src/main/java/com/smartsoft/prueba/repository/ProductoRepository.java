package com.smartsoft.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartsoft.prueba.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

	/**
	 * 
	 * @return
	 */
	public List<Producto> findAll();

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Producto findById(long id);

}
