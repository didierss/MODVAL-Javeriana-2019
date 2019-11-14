package com.convenios.convenio.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.convenios.convenio.modelo.convenios;
import com.convenios.convenio.services.convenioService;

import co.edu.javeriana.aes.modval.pagos.boundary.PagosInerface;
import co.edu.javeriana.aes.modval.pagos.boundary.PagosService;
import co.servicios.pagos.schemas.ReferenciaFactura;
import facturaPackage.FacturaClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;





//Clase que representa servicio web para convenios

@RestController
@RequestMapping("/convenios")
@Api(tags = "convenio")
public class convenioResource {
	
	private final convenioService convenioService;
	
	public convenioResource(convenioService convenioService) {
		this.convenioService = convenioService;
	}
	
	@GetMapping
	public String findAll(){
		 //	consumo rest
	    FacturaClient servicio = new FacturaClient();

	    System.out.println(((String)servicio.getInfoFactura_JSON(String.class, "1234228008")).toString());
	    
//		return ResponseEntity.ok(this.convenioService.findAll());
	    return ((String)servicio.getInfoFactura_JSON(String.class, "1234228008")).toString();
	}
	
	@GetMapping("/{numeroConvenio}")
	@ApiOperation(value = "Consultar convenio")
	@ApiResponses(value = {@ApiResponse(code = 201, message = "El convenio existe en el sistema"),
			@ApiResponse(code = 400, message = "El convenio no existe en el sistema")})
	public String findBynumero(@PathVariable("numeroConvenio") String numeroConvenio){
		

		
		
		
		
		
		 //	consumo soap
		PagosService service = new PagosService();
	    PagosInerface proxy = service.getPagosPort();

	    ReferenciaFactura referenciaFactura = new ReferenciaFactura();
	    referenciaFactura.setReferenciaFactura("1234228008");
	    System.err.println(proxy.cosultar(referenciaFactura).getReferenciaFactura().getReferenciaFactura()+" -" + proxy.cosultar(referenciaFactura).getTotalPagar());
	//return ResponseEntity.ok(this.convenioService.findBynumero(numeroConvenio));
	   return (proxy.cosultar(referenciaFactura).getReferenciaFactura().getReferenciaFactura()+" -" + proxy.cosultar(referenciaFactura).getTotalPagar());
	}

}
