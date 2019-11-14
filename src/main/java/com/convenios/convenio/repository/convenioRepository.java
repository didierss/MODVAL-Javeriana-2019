package com.convenios.convenio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.convenios.convenio.modelo.convenios;

// Interfaz para definir operaciones de base de datos con tabla de administrción de Convenios

public interface convenioRepository extends JpaRepository<convenios, String>	{
	
	public convenios findBynumero (String numeroConvenio);

}
