/**
 * 
 */
package com.Newton.PruebaCoppel.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Newton.PruebaCoppel.model.Cuenta;


@Service
public class CuentaService {
	private final CuentaRepository cuentaRepository;

	@Autowired
	public CuentaService(CuentaRepository cuentaRepository) {
		super();
		this.cuentaRepository = cuentaRepository;
	}//Constructor


public List<Cuenta> getCuentas(){
	return cuentaRepository.findAll();
}
public Cuenta getCuenta(String id) {
	return cuentaRepository.findById(id).orElseThrow(()->new IllegalArgumentException("la cuenta con el id "+id +"no existe"));
}

public Cuenta deleteCuenta (String id) 
{
	Cuenta tmp = null;
	if(cuentaRepository.existsById(id)) {
		tmp  = cuentaRepository.findById(id).get();
		cuentaRepository.deleteById(id);
	}
	return tmp;
}
public Cuenta addCuenta(Cuenta cuenta) {
	return cuentaRepository.save(cuenta);
}

public Cuenta updateCuenta(String id, String nombre, String banco, String tipo, Double monto, Long idUsuario) {
	Cuenta tmp = null;
	if(cuentaRepository.existsById(id)) {
		 tmp  = cuentaRepository.findById(id).get();
		if(nombre!=null) tmp.setNombre(nombre);
		if(banco!=null) tmp.setBanco(banco);
		if(tipo!=null) tmp.setTipo(tipo);
		if(monto!=null) tmp.setMonto(monto);
		if(idUsuario!=null) tmp.setIdUsuario(idUsuario);
		cuentaRepository.save(tmp);
		}else {System.out.println("la cuenta con el id: "+id+" no existe");}
	return tmp;
}

	

}
