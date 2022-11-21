/**
 * 
 */
package com.Newton.PruebaCoppel.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Newton.PruebaCoppel.model.Cuenta;

/**
 * @author Steven
 *
 */
public interface CuentaRepository extends MongoRepository<Cuenta,String>{

}
