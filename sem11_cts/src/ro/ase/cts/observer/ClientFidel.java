package ro.ase.cts.observer;

public class ClientFidel implements Observer{

	private String nume;
	
	public ClientFidel(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void primesteMeasaj(String mesaj) {
		System.out.println(nume+" a primit mesajul: "+mesaj);
	}

}
