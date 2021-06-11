package com.edutecno.ejemplo001;
//aqui hice un cambio
public class Auto extends Vehiculo {

	public Auto(String marca) {
		super(marca);
	}

	@Override
	public void acelerar() {
		System.out.println("acelerando el " + super.getMarca());
	}
	
}
