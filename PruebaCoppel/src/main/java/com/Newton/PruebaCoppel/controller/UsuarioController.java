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
import com.Newton.PruebaCoppel.model.Usuario;
import com.Newton.PruebaCoppel.service.UsuarioService;


@RestController
@RequestMapping(path="/usuario")// http://localhost:8080/usuario
public class UsuarioController {
	private final UsuarioService usuarioService;
	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
		super();
		this.usuarioService = usuarioService;
	}
	@GetMapping
	public List<Usuario>getAllUsuarios(){
		return usuarioService.getUsuarios();
	}
	@GetMapping (path="/{userId}")
	public Usuario getUsuario(@PathVariable("userId")Long id){
		return usuarioService.getUsuario(id);
	}
	@GetMapping (path="/buscar/porNombre/{nombre}")
	public  List<Usuario> getUsuarioNombre(@PathVariable("nombre")String nombre){
		return usuarioService.getUsuarioNombre(nombre);
	}
	@GetMapping (path="/buscar/porApellidoP/{apellidoP}")
	public  List<Usuario> getUsuarioApellidoP(@PathVariable("apellidoP")String apellidoP){
		return usuarioService.getUsuarioApellidoP(apellidoP);
	}
	@GetMapping (path="/buscar/porApellidoM/{apellidoM}")
	public  List<Usuario> getUsuarioApellidoM(@PathVariable("apellidoM")String apellidoM){
		return usuarioService.getUsuarioApellidoM(apellidoM);
	}
	@GetMapping (path="/buscar/porCorreo/{correo}")
	public  List<Usuario> getUsuarioCorreo(@PathVariable("correo")String correo){
		return usuarioService.getUsuarioCorreo(correo);
	}
	@GetMapping (path="/buscar/porTelefono/{telefono}")
	public  List<Usuario> getUsuarioTelefono(@PathVariable("telefono")String telefono){
		return usuarioService.getUsuarioTelefono(telefono);
	}
	@GetMapping (path="/buscar/porEdad/{edad}")
	public  List<Usuario> getUsuarioEdad(@PathVariable("edad")Integer edad){
		return usuarioService.getUsuarioEdad(edad);
	}
	@DeleteMapping (path="{userId}")
	public Usuario deleteUsuario(@PathVariable("userId")Long id){
		return usuarioService.deleteUsuario(id);
	}//deleteUsuario
	@PostMapping
	public Usuario addUsuario(@RequestBody Usuario usuario) {
		return usuarioService.addUsuario(usuario);
	}//addUsuario
	@PutMapping (path= "/{userId}")
	public Usuario updateProduct(@PathVariable("userId") Long id,
			@RequestParam(required=false) 	String nombre,
			@RequestParam(required=false) 	 String apellidoP,
			@RequestParam(required=false) 	 String apellidoM,
			@RequestParam(required=false) 	 String correo,
			@RequestParam(required=false) 	 String telefono,
			@RequestParam(required=false) 	 Integer edad
	) {
		return usuarioService.updateUsuario(id,nombre,apellidoP,apellidoM,correo,telefono,edad);
		
	}//updateUsuario

}