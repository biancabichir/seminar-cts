package ro.ase.cts.proxy.clase;

public class OperatorRezervari implements IOperatorRezervari{

	@Override
	public void realizeazaRezervarea(int nrPersoane) {
		System.out.println("A fost realizata rezervarea pentru "+nrPersoane);
		
	}

}
