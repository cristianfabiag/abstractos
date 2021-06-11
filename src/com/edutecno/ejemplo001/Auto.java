package com.edutecno.ejemplo001;

/***
 * Comentario
 * @author Administrator...
 *
 */
public class Auto extends Vehiculo {

	public Auto(String marca) {
		super(marca);
	}

	@Override
	public void acelerar() {
		System.out.println("acelerando el " + super.getMarca());
	}
	
}
