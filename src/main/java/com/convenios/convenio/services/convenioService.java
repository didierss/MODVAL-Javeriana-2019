package com.convenios.convenio.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.convenios.convenio.modelo.convenios;
import com.convenios.convenio.repository.convenioRepository;

import co.edu.javeriana.aes.modval.pagos.boundary.PagosInerface;
import co.edu.javeriana.aes.modval.pagos.boundary.PagosService;
import co.servicios.pagos.schemas.ReferenciaFactura;
import facturaPackage.FacturaClient;



//Clase para definir los servicios de Convenio


@Service
@Transactional(readOnly = true)
public class convenioService {
	
	private final convenioRepository convenioRepository;
	
	public convenioService(convenioRepository convenioRepository) {
		this.convenioRepository = convenioRepository;
	}
	
	//Metodo para buscar un convenio por su identificación
	
	public convenios findBynumero (String numeroConvenio) {
		
		 //	consumo rest
	    FacturaClient servicio = new FacturaClient();

	    System.out.println(((String)servicio.getInfoFactura_JSON(String.class, "1234228008")).toString());

		
		return this.convenioRepository.findBynumero(numeroConvenio);
	}
	
	public List<convenios> findAll(){
		 //	consumo 
		
		PagosService service = new PagosService();
	    PagosInerface proxy = service.getPagosPort();

	    ReferenciaFactura referenciaFactura = new ReferenciaFactura();
	    referenciaFactura.setReferenciaFactura("1234228008");
	    System.err.println(proxy.cosultar(referenciaFactura).getTotalPagar());
		return this.convenioRepository.findAll();
	}
}
