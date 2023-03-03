package com.bolsadeideas.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Region;
import org.springframework.data.repository.query.Param;

public interface IClienteDao extends JpaRepository<Cliente, Long>{
	@Query(value = "SELECT c.* FROM clientes c  WHERE c.nombre = :Nombre ", nativeQuery = true)
	Cliente findClientByName(@Param("Nombre") String nombre);
}
