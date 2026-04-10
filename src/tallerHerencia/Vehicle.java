package tallerHerencia;

import java.time.LocalDate;

public abstract class Vehicle {
	
	// Atributs de la classe Vehicle
	protected String matricula;
	protected String marca;
	protected int any;
	protected double costKm;
	
	// Constructor de la classe
	public Vehicle(String matricula, String marca, int any) {
		this.matricula = matricula;
		this.marca = marca;
		this.any = any;
	}
	
	// Mètodes abstractes de la classe Vehicle
	public abstract int calcularCostManteniment();
	public abstract double calcularCostRuta(int km);
	
	// Mètode esAntic()
	public boolean esAntic() {
		
		int anyActual = LocalDate.now().getYear();
		return ((anyActual - this.any) > 15) ? true : false;
	}

	@Override
	public String toString() {
		return "Matricula: " + matricula + ", marca: " + marca + ", any: " + any;
	}
}
