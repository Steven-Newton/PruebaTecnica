package com.Newton.PruebaCoppel.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Newton.PruebaCoppel.model.Usuario;


@Service
public class UsuarioService {
private final UsuarioRepository usuarioRepository;
@Autowired
public UsuarioService(UsuarioRepository usuarioRepository) {
	super();
	this.usuarioRepository = usuarioRepository;
}//Constructor

public List<Usuario> getUsuarios(){
	return usuarioRepository.findAll();
}
public Usuario getUsuario(Long id) {
	return usuarioRepository.findById(id).orElseThrow(()->new IllegalArgumentException("el usuario con el id "+id +"no existe"));
}
public  List<Usuario> getUsuarioNombre(String nombre) {
	return usuarioRepository.findByNombre(nombre).orElseThrow(()->new IllegalArgumentException("el usuario con el nombre "+nombre+"no existe"));
}
public  List<Usuario> getUsuarioApellidoP(String apellidoP) {
	return usuarioRepository.findByApellidoP(apellidoP).orElseThrow(()->new IllegalArgumentException("el usuario con el apellidoP "+apellidoP+"no existe"));
}
public  List<Usuario> getUsuarioApellidoM(String apellidoM) {
	return usuarioRepository.findByApellidoM(apellidoM).orElseThrow(()->new IllegalArgumentException("el usuario con el apellidoM "+apellidoM+"no existe"));
}
public  List<Usuario> getUsuarioEdad(Integer edad) {
	return usuarioRepository.findByEdad(edad).orElseThrow(()->new IllegalArgumentException("el usuario con la edad "+edad+"no existe"));
}
public  List<Usuario> getUsuarioTelefono(String telefono) {
	return usuarioRepository.findByTelefono(telefono).orElseThrow(()->new IllegalArgumentException("el usuario con el telefono "+telefono+"no existe"));
}
public  List<Usuario> getUsuarioCorreo(String correo) {
	return usuarioRepository.findByNombre(correo).orElseThrow(()->new IllegalArgumentException("el usuario con el correo "+correo+"no existe"));
}

public Usuario deleteUsuario (Long id) 
{
	Usuario tmpUser = null;
	if(usuarioRepository.existsById(id)) {
		tmpUser  = usuarioRepository.findById(id).get();
		usuarioRepository.deleteById(id);
	}
	return tmpUser;
}
public Usuario addUsuario(Usuario usuario) {
	return usuarioRepository.save(usuario);
}


public Usuario updateUsuario(Long id, String nombre, String apellidoP, String apellidoM, String correo, String telefono,
		Integer edad) {
	Usuario tmpUser = null;
	if(usuarioRepository.existsById(id)) {
		 tmpUser  = usuarioRepository.findById(id).get();
		if(nombre!=null) tmpUser.setNombre(nombre);
		if(apellidoP!=null) tmpUser.setApellidoP(apellidoP);
		if(apellidoM!=null) tmpUser.setApellidoM(apellidoM);
		if(correo!=null) tmpUser.setCorreo(correo);
		if(telefono!=null) tmpUser.setTelefono(telefono);
		if(edad!=null) tmpUser.setEdad(edad);
		usuarioRepository.save(tmpUser);
		}else {System.out.println("el usuario con el id: "+id+" no existe");}
	return tmpUser;
}



}

