package com.edutecno.ejemplo002;

public class Auto extends Vehiculo {

	public Auto(String marca) {
		super(marca);
	}
	
	@Override
	public void acelerar() {
		System.out.println("auto acelerando");
	}
	
	
	
	
}
