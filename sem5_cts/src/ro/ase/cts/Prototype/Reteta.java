package ro.ase.cts.Prototype;

public class Reteta implements RetetaMedicament {
	private String solutie;
	private int cantitate;
	public String getSolutie() {
		return solutie;
	}
	public int getCantitate() {
		return cantitate;
	}
	
	public Reteta(){
		super();
	}
	public Reteta(String solutie, int cantitate) {
		super();
		this.solutie = solutie;
		this.cantitate = cantitate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reteta [solutie=");
		builder.append(solutie);
		builder.append(", cantitate=");
		builder.append(cantitate);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public RetetaMedicament copiaza() {
		Reteta reteta=new Reteta();
		reteta.solutie=this.solutie;
		reteta.cantitate=this.cantitate;
		return reteta;
	}
	

}
