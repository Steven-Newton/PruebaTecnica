package com.Newton.PruebaCoppel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)//genera automatico
@Column(name="id",unique=true,nullable=false) //unico y no es nulo
private long id;
private String nombre;
private String apellidoP;
private String apellidoM;
private String correo;
private String telefono;
private int edad;

public Usuario(long id, String nombre, String apellidoP, String apellidoM, String correo, String telefono, int edad) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.apellidoP = apellidoP;
	this.apellidoM = apellidoM;
	this.correo = correo;
	this.telefono = telefono;
	this.edad = edad;
}
//Constructor Vacio
public Usuario() {
	super();
}
//Getters y Setters 
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidoP() {
	return apellidoP;
}
public void setApellidoP(String apellidoP) {
	this.apellidoP = apellidoP;
}
public String getApellidoM() {
	return apellidoM;
}
public void setApellidoM(String apellidoM) {
	this.apellidoM = apellidoM;
}
public String getCorreo() {
	return this.correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public long getId() {
	return id;
}


}
