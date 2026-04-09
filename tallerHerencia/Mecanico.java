package tallerHerencia;

public class Mecanico implements Comparable<Mecanico>{

private int anyNaixament;
private int sou;
private String nom;


public Mecanico(String nom, int sou, int anyNaixement) {
	// TODO Esbozo de constructor generado automáticamente
	this.nom=nom;
	this.sou=sou;
	this.anyNaixament=anyNaixement;
}

public int getAnyNaixament() {
	return anyNaixament;
}

public void setAnyNaixament(int anyNaixament) {
	this.anyNaixament = anyNaixament;
}

public int getSou() {
	return sou;
}

public void setSou(int sou) {
	this.sou = sou;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}


@Override
public int compareTo(Mecanico mecanico) {
	if(this.nom.compareTo(nom)==0) {
		return this.sou(mecanico.sou);	
	}
	
	return this.nom.compareTo(mecanico.nom);
}

@Override
public String toString() {
	return this.nom + (" ,")+this.sou+(" ,")+this.anyNaixament;
}
}
