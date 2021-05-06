package ro.ase.cts.chainOfResponsability.program;

import ro.ase.cts.chainOfResponsability.clase.ContCredit;
import ro.ase.cts.chainOfResponsability.clase.ContCurent;
import ro.ase.cts.chainOfResponsability.clase.ContEconomii;
import ro.ase.cts.chainOfResponsability.clase.Handler;
import ro.ase.cts.chainOfResponsability.clase.RefuzaTranzactia;

public class Program {

	public static void main(String[] args) {
		Handler contCredit=new ContCredit(500);
		Handler contCurent=new ContCurent(200);
		Handler contEconomii=new ContEconomii(100);
		Handler refuzaTranzactia=new RefuzaTranzactia();
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(refuzaTranzactia);
		contCurent.realizeazaPlata(300);

	}

}
