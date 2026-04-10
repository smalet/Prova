package tallerHerencia;

public class Taller {

	// Atributs de la classe
	private Vehicle[] vehicles;
	private int numVehicles;
	private static final int MAX_VEHICLES = 10;

	// Constructor de la classe
	public Taller(int capacitatTaller) {
		this.vehicles = new Vehicle[capacitatTaller];
		this.numVehicles = 0;
	}

	public Taller() {
		this.vehicles = new Vehicle[MAX_VEHICLES];
		this.numVehicles = 0;
	}

	// Mètodes de la classe taller
	/**
	 * Mètode afegir vehicle
	 * @param v
	 * @return true si s'ha pogut afegir el vehicle, false en cas contrari
	 */
	public boolean afegirVehicle(Vehicle v) {

		if (this.numVehicles < this.vehicles.length) {
			this.vehicles[this.numVehicles] = v; 
			this.numVehicles++;
			return true;
		}else {
			return false;
		}
	}

	/**
	 * Mètode mostrarVehicles
	 */
	public void mostrarVehicles() {
		// Recorrem tot l'array de vehicles i els mostrem
		for (int i = 0; i < this.numVehicles; i++) {
			System.out.println(this.vehicles[i]);
		}
	}

	/**
	 * Metode que retorna el cost Total del manteniment dels cotxes del taller
	 * @return
	 */
	public int costTotalManteniment() {
		int costTotal = 0;
		// Recorrem tot l'array de vehicles i sumem els cost de manteniment del vehicle que toca al total.
		for (int i = 0; i < this.numVehicles; i++) {
			costTotal += this.vehicles[i].calcularCostManteniment();
		}
		return costTotal;
	}

	/**
	 * Funcio que mostra tots els vehicles que son antics (+ de 15 anys) del taller
	 */
	public void vehiclesAntics() {
		// Recorrem tot l'array de vehicles i els mostrem només els antics
		for (int i = 0; i < this.numVehicles; i++) {
			
			// Si es antic el mostrem
			if(this.vehicles[i].esAntic()) {				
				System.out.println(this.vehicles[i]);
			}
			
		}
	}
	
	/**
	 * Funcio que mostra el que costa la ruta a la distancia que rebem per parametre de cada vehicle
	 * @param km
	 */
	public void mostrarCostRutaVehicles(int km) {
		for (int i = 0; i < this.numVehicles; i++) {
			System.out.println(vehicles[i] + " - " + vehicles[i].calcularCostRuta(km) + "€");
		}
	}
	
	/**
	 * Funcio que fa que els cotxes que poden repartir del taller surtin a repartir al desti que ens passen
	 * @param desti
	 */
	public void ferRepartimentVehiclesTaller(String desti) {
		Moto moto;
		Camio camio;
		for (int i = 0; i < this.numVehicles; i++) {
			
			//this.vehicles[i].ferRepartiment(desti);
			// Aquesta instrucció no la podem fer, perque no sabem qui la pot fer o no.
			
			// Si el vehicle es una moto
			if (this.vehicles[i] instanceof Moto)  {
				moto = (Moto) this.vehicles[i];
				moto.ferRepartiment(desti);
			}
			// Si el vehicle es un camio
			if (this.vehicles[i] instanceof Camio) {
				camio = (Camio) this.vehicles[i];
				camio.ferRepartiment(desti);
			}
		}
	}

}
