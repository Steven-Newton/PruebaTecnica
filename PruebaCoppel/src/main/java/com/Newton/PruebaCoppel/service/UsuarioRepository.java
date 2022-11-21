package com.Newton.PruebaCoppel.service;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Newton.PruebaCoppel.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	@Query("SELECT u FROM Usuario u WHERE u.nombre=?1")//JPQL
	Optional<List<Usuario>> findByNombre(String nombre);
	@Query("SELECT u FROM Usuario u WHERE u.correo=?1")//JPQL
	Optional<List<Usuario>> findByCorreo(String correo);
	@Query("SELECT u FROM Usuario u WHERE u.apellidoP=?1")//JPQL
	Optional<List<Usuario>> findByApellidoP(String apellidoP);
	@Query("SELECT u FROM Usuario u WHERE u.apellidoM=?1")//JPQL
	Optional<List<Usuario>> findByApellidoM(String apellidoM);
	@Query("SELECT u FROM Usuario u WHERE u.edad=?1") //JPQL
	Optional<List<Usuario>> findByEdad(Integer edad);
	@Query("SELECT u FROM Usuario u WHERE u.telefono=?1")//JPQL
	Optional<List<Usuario>> findByTelefono(String telefono);
}
