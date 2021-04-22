package ro.ase.cts.state.clase;

public class Masa {
private int nrMasa;
private Stare stare;
public Masa(int nrMasa) {
	super();
	this.nrMasa = nrMasa;
	this.stare=new StareLibera();
}
public void rezervaMasa() {
	if(this.stare instanceof StareLibera) {
		this.stare=new StareRezervata();
		System.out.println("A fost rezervata masa cu numarul "+nrMasa);
		
	}
	else {
		System.out.println("Masa cu numarul "+nrMasa+" nu poate fi rezervata");
	}
}
public void ocupaMasa() {
	if(this.stare instanceof StareLibera || this.stare instanceof StareRezervata) {
	this.stare=new StareOcupata();
	System.out.println("A fost ocupata masa cu numarul "+nrMasa);
	
	}
	else {
		System.out.println("Masa cu numarul "+nrMasa+" nu poate fi ocupata");
	}
}
public void eliberareMasa() {
	if(!(this.stare instanceof StareLibera)) {
		this.stare=new StareLibera();
		System.out.println("Masa cu numarul "+nrMasa+" a fost eliberata");
		
	}
	else{
		System.out.println("Masa cu numarul "+nrMasa+" este deja libera");
	}
}
}
