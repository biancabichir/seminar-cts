package ro.ase.cts.template;

public class Spectator extends SpectatorAbstract {

	private String nume;
	
	public Spectator(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareCoada() {
		System.out.println(nume+" se va aseza la coada");
		
	}

	@Override
	public void prezintaBilet() {
		System.out.println(nume+" va prezenta bilet");
		
	}

	@Override
	public void realizareControlCorporal() {
		System.out.println("Pentru "+nume+" se va realiza control corporal ");
		
	}

	@Override
	public void intrarePeStadion() {
		System.out.println(nume+" intra pe stadion");
	}

	@Override
	public void ocupaLoc() {
		System.out.println(nume+" ocupa loc");
		
	}

}
