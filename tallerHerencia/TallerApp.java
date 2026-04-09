package tallerHerencia;

public class TallerApp {

	public static void main(String[] args) {
		// 
		Taller manolo = new Taller(10);
		
		Mecanico[] treballadors = {new Mecanico("Pepe",1000,1990),
				new Mecanico("Manolo",5000,1980),
				new Mecanico("Pepe jr",500,2002),
				new Mecanico("Manolo",2500,2005)
		};
		
		/*
		if (pepe.compareTo(manolete)>0) {
			System.out.println("Pepe gana más que Manolo");
		}
		else if (pepe.compareTo(manolete)<0) {
			System.out.println("Pepe gana menos que Manolo");
		}
		else {
			System.out.println("Pepe y Manolo ganan igual");
		}
		*/
		
		System.out.println("TREBALLADORS DEL TALLER");
		
		Moto suzuki = new Moto("1234LGH","Suzuki", 2015, 125);
		Camio iveco = new Camio("2233KJL", "Iveco", 2020, 5000);
		Cotxe mercedes = new Cotxe("5372KFC", "Mercedes", 2019, 5);
		Moto bultaco = new Moto("T-1234-AC", "Bultaco", 1898, 125);
		
		manolo.afegirVehicle(suzuki);
		manolo.afegirVehicle(iveco);
		manolo.afegirVehicle(mercedes);
		manolo.afegirVehicle(bultaco);
		
		System.out.println("**** MOSTRAR VEHICLES DEL TALLER ****");
		manolo.mostrarVehicles();
		
		System.out.println("\n**** MOSTRAR COST RUTA DE 120KM DE TOTS ELS VEHICLES DEL TALLER ****");
		manolo.mostrarCostRutaVehicles(120);
		
		System.out.println("\nCost total Manteniment Taller: " + manolo.costTotalManteniment() + "€");
		
		System.out.println("\n**** FEM QUE TOTS ELS VEHICLES DEL TALLER SURTIN A REPARTIR ****");
		manolo.ferRepartimentVehiclesTaller("Barcelona");
		
		System.out.println("\n**** MOSTREM ELS VEHICLES ANTICS DEL TALLER ****");
		manolo.vehiclesAntics();
	}

}
