package ro.ase.cts.chainOfResponsability.clase;

public class ContEconomii extends Handler{

	public ContEconomii(float sold) {
		super(sold);
		
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(super.getSold()>=suma) {
			System.out.println("S-a realizat plata din contul de economii in valoare de "+suma);
			super.setSold(super.getSold()-suma);
		}
		else {
			super.getSuccesor().realizeazaPlata(suma);
		}
		
	}

}
