package com.edutecno.ejemplo001;

public class Main {

	public static void main(String[] args) {
		Auto auto = new Auto("mercedes");
		Moto moto = new Moto("ducati");
		Tanque tanque = new Tanque("tiger");
		System.out.println(auto.getMarca());
		System.out.println(moto.getMarca());
		System.out.println(tanque.getMarca());
		acelerarVehiculo(auto);
		acelerarVehiculo(moto);
		acelerarVehiculo(tanque);
		//y los otros tipos de vehiculos.
	}
	
	public static void acelerarVehiculo(Vehiculo vehiculo) {
		vehiculo.acelerar();
	}
	
}
