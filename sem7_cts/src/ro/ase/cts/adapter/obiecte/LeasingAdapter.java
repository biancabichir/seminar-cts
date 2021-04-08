package ro.ase.cts.adapter.obiecte;

public class LeasingAdapter implements Creditable {
	private Leasing leasing;
	

	public LeasingAdapter(Leasing leasing) {
		super();
		this.leasing = leasing;
	}


	@Override
	public void oferaCredit() {
		this.leasing.oferaLeasing();
		
	}

}
