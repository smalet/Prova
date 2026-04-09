package tallerHerencia;

public class Camio extends Vehicle implements Repartible{
	
	// Atributs de la classe Camio
	private double tonatge;
	
	
	// Constructor de la classe
	public Camio(String matricula, String marca, int any, double tonatge) {
		super(matricula, marca, any);
		this.tonatge = tonatge;
		this.costKm = 0.5;
	}

	@Override
	public int calcularCostManteniment() {
		// Variables locals
		final int costBase = 300;
		final int suplementTonatge = 100;
		
		return (this.tonatge > 10) ? (costBase + suplementTonatge) : costBase;
	}
	
	@Override
	public double calcularCostRuta(int km) {
		return km * this.costKm;
	}
	
	public void ferRepartiment(String destinacio) {
		System.out.println("Camió repartint a " + destinacio);
	}
	
	public String toString() {
		return "Camio - " + super.toString();
	}

}
