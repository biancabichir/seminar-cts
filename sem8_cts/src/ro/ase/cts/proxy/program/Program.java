package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.OperatorRezervari;
import ro.ase.cts.proxy.clase.ProxyOperatorRezervare;

public class Program {

	public static void main(String[] args) {
		OperatorRezervari operator1=new OperatorRezervari();
		operator1.realizeazaRezervarea(2);
		ProxyOperatorRezervare proxyOperator=new ProxyOperatorRezervare(operator1,4);
		proxyOperator.realizeazaRezervarea(2);

	}

}
