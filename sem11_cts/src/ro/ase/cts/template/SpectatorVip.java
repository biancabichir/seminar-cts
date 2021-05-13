package ro.ase.cts.template;

public class SpectatorVip extends SpectatorAbstract {
	private String numeVip;
	

	public SpectatorVip(String numeVip) {
		super();
		this.numeVip = numeVip;
	}

	@Override
	public void asezareCoada() {
		System.out.println(numeVip+" se prezinta direct la usa");
	}

	@Override
	public void prezintaBilet() {
		System.out.println(numeVip+" prezinta bilet VIP");
		
	}

	@Override
	public void realizareControlCorporal() {
		System.out.println(numeVip+" realizeaza control");
		
	}

	@Override
	public void intrarePeStadion() {
		System.out.println(numeVip+" intra la loja");
		
	}

	@Override
	public void ocupaLoc() {
		System.out.println(numeVip+" ocupa loc in loja");
		
	}

}
