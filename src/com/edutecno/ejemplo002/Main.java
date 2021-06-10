package com.edutecno.ejemplo002;

public class Main {

	public static void main(String[] args) {
		Auto auto = new Auto("mercedes");
		acelerarVehiculo(auto);
		Moto moto = new Moto("ducati");
		acelerarVehiculo(moto);
		Camion camion = new Camion("Volvo");
		acelerarVehiculo(camion);
		
	}
	
	public static void acelerarVehiculo(Vehiculo vehiculo) {
		System.out.println("Creamos un vehiculo de tipo " + vehiculo.getClass().getSimpleName() + " de marca " + vehiculo.getMarca());
		vehiculo.acelerar();
	}

}
