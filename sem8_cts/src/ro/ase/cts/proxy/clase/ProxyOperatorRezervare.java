package ro.ase.cts.proxy.clase;

public class ProxyOperatorRezervare implements IOperatorRezervari{
 
	OperatorRezervari operator;
	private int nrMinPersoane;
	
	public ProxyOperatorRezervare(OperatorRezervari operator,int nrMinPersoane) {
		super();
		this.operator = operator;
		this.nrMinPersoane=nrMinPersoane;
	}

	@Override
	public void realizeazaRezervarea(int nrPersoane) {
		if(nrPersoane>= nrMinPersoane) {
			operator.realizeazaRezervarea(nrPersoane);
		}
		else {
			System.out.println("Va rugam veniti la restaurant fara rezervare");
		}
		
	}
	

}
