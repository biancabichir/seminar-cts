package ro.ase.cts.chainOfResponsability.clase;

public class ContCurent extends Handler{

	public ContCurent(float sold) {
		super(sold);
		
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(super.getSold()>=suma) {
			System.out.println("S-a realizat plata din contul curent in valoare de "+suma);
			super.setSold(super.getSold()-suma);
		}
		else {
			super.getSuccesor().realizeazaPlata(suma);
		}
	}

}
