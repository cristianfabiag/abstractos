package com.edutecno.ejemplo002;

public class Moto extends Vehiculo{

	public Moto(String marca) {
		super(marca);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void acelerar() {
		System.out.println("moto acelerando");
	}
		
}
