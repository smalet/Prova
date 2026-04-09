package tallerHerencia;

public class Cotxe extends Vehicle {
	
	// Atributs de la classe cotxe
	private int numPortes;
	
	public Cotxe(String matricula, String marca, int any, int numPortes) {
		super(matricula, marca, any);
		this.numPortes = numPortes;
		this.costKm = 0.25;
	}

	@Override
	public int calcularCostManteniment() {
		
		// Variables locals
		final int costBase = 200;
		final int suplementAntic = 50;
		
		return super.esAntic() ? (costBase + suplementAntic) : costBase;
		
	}
	
	public double calcularCostRuta(int km) {
		return km * this.costKm;
	}
	
	public String toString() {
		return "Cotxe: " + super.toString();
	}

}
