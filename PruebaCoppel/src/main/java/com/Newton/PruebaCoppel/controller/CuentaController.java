/**
 * 
 */
package com.Newton.PruebaCoppel.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.Newton.PruebaCoppel.model.Cuenta;
import com.Newton.PruebaCoppel.service.CuentaService;

@RestController
@RequestMapping(path="/cuentas")
public class CuentaController {
	private final CuentaService  cuentaService;
	
	@Autowired
	public CuentaController(CuentaService cuentaService) {
		super();
		this.cuentaService = cuentaService;
	}
	
	@GetMapping
	public List<Cuenta>getAllUsuarios(){
		return cuentaService.getCuentas();
	}
	
	@GetMapping (path="{cuentaId}")
	public Cuenta getCuenta(@PathVariable("cuentaId")String id){
		return cuentaService.getCuenta(id);
	}
	
	@DeleteMapping (path="{cuentaId}")
	public Cuenta deleteCuenta(@PathVariable("cuentaId")String id){
		return cuentaService.deleteCuenta(id);
	}//deleteUsuario
	
	@PostMapping
	public Cuenta addCuenta(@RequestBody Cuenta cuenta) {
		return cuentaService.addCuenta(cuenta);
	}//
	@PutMapping (path= "{cuentaId}")
	public Cuenta updateCuenta(@PathVariable("cuentaId") String id,
			@RequestParam(required=false) 	String nombre,
			@RequestParam(required=false) 	 String banco,
			@RequestParam(required=false) 	 String tipo,
			@RequestParam(required=false) 	 Double Monto,
			@RequestParam(required=false) 	 Long idUsuario
	) {
		return cuentaService.updateCuenta(id,nombre,banco,tipo,Monto,idUsuario);
		
	}//updateUsuario
	

}
