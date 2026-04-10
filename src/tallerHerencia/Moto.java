package tallerHerencia;

public class Moto extends Vehicle implements Repartible{

	// Atributs de la classe Moto
	private int cilindrada;
	
	
	// Constructor
	public Moto(String matricula, String marca, int any, int cilindrada) {
		super(matricula,marca, any);
		this.cilindrada = cilindrada;
		this.costKm = 0.1;
	}
	
	@Override
	public int calcularCostManteniment() {
		final int costBase = 100;
		final int sumplementCilindrada = 30;
		return (this.cilindrada > 500) ? (costBase + sumplementCilindrada) : costBase;
	}
	
	@Override
	public double calcularCostRuta(int km) {
		return km * this.costKm;
	}
	
	public void ferRepartiment(String destinacio) {
		System.out.println("Moto repartint a " + destinacio);
	}

	public String toString() {
		return "Moto - " + super.toString();
	}
}
