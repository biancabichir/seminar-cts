package ro.ase.cts.facade;


public class Program {

	public static void main(String[] args) {
		Persoana persoana=new Persoana("Ioana","2999145390269");
		if(persoana.getVarsta()>=18) {
			if(!Politie.esteUrmaritDePolitie(persoana)) {
				if(! BirouCredite.areCredite(persoana)) {
					System.out.println("I se ofera creditul lui "+persoana.getNume());
				}
			}
		}
Persoana persoana2=new Persoana("Ana","2999145390267");
if(Facade.esteAptaPersoana(persoana2))
	System.out.println("I se acorda creditul");
else 
	System.out.println("Nu i se acorda creditul");
	}

}
