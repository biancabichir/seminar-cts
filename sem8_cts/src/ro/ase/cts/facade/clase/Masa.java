package ro.ase.cts.facade.clase;

public class Masa {
	private int cod;
	private int numarMaximPersoane;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Masa [cod=");
		builder.append(cod);
		builder.append(", numarMaximPersoane=");
		builder.append(numarMaximPersoane);
		builder.append("]");
		return builder.toString();
	}
	public Masa(int cod, int numarMaximPersoane) {
		super();
		this.cod = cod;
		this.numarMaximPersoane = numarMaximPersoane;
	}
	public int getCod() {
		return cod;
	}
	public int getNumarMaximPersoane() {
		return numarMaximPersoane;
	}
	

}
