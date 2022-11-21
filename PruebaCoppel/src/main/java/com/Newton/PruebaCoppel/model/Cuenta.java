/**
 * 
 */
package com.Newton.PruebaCoppel.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Steven 
 *
 */
@Document("Cuentas")
public class Cuenta {
	  @Id
	  private String id;
	  private String nombre;
	  private String banco;
	  private String tipo;
	  private Double monto;
	  private Long idUsuario;

	  
	/**
	 * 
	 */
	public Cuenta() {
		super();
	}

	public Cuenta(String id, String nombre, String banco, String tipo, Double monto, Long idUsuario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.banco = banco;
		this.tipo = tipo;
		this.monto = monto;
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getId() {
		return id;
	}
	  
	
}
