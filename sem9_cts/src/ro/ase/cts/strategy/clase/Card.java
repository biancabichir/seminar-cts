package ro.ase.cts.strategy.clase;

public class Card implements ModalitatePlata {

	@Override
	public void plateste(double suma) {
		System.out.println("A fost afisata plata cu cardul pentru suma de "+suma);
		
	}

}
