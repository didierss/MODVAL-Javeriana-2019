/**
 * 
 */
package com.convenios.convenio.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * @author didierchipatecua
 * Clase que representa la tabla convenios
 */

@Data
@Entity
@Table(name = "convenio")
@NamedQuery(name = "convenios.findBynumero", query ="Select c from convenios c where c.numero = ?1")
public class convenios {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String numero;
	private String nombre;
   
	
	public convenios() {
		
	}
}
