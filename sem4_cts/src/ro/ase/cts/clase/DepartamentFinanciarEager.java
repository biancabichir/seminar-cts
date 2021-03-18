package ro.ase.cts.clase;

public class DepartamentFinanciarEager {
	private int nrAngajati;
	private String director;
	private double salariulDeBaza;
	private static DepartamentFinanciarEager departamentFinanciarEager = 
			new DepartamentFinanciarEager(10,"Popescu",3000);
	
	private DepartamentFinanciarEager(int nrAngajati,String director,double salariulDeBaza)
	{
		this.nrAngajati=nrAngajati;
		this.director=director;
		this.salariulDeBaza=salariulDeBaza;
	}
	
	public static DepartamentFinanciarEager getInstance()
	{
		return departamentFinanciarEager;
	}

	public void setNrAngajati(int nrAngajati) {
		this.nrAngajati = nrAngajati;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setSalariulDeBaza(double salariulDeBaza) {
		this.salariulDeBaza = salariulDeBaza;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DepartamentFinanciarEager [nrAngajati=");
		builder.append(nrAngajati);
		builder.append(", director=");
		builder.append(director);
		builder.append(", salariulDeBaza=");
		builder.append(salariulDeBaza);
		builder.append("]");
		return builder.toString();
	}

}
