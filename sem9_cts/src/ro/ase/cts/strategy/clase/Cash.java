package ro.ase.cts.strategy.clase;

public class Cash implements ModalitatePlata{

	@Override
	public void plateste(double suma) {
		System.out.println("A fost afisata plata cash pentru suma de "+suma);
	}

}
