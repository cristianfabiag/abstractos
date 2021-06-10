package com.edutecno.ejemplo002;

public abstract class Vehiculo {
	private String marca;

	
	
	public Vehiculo(String marca) {
		super();
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public abstract void acelerar();
	
	
	
}
