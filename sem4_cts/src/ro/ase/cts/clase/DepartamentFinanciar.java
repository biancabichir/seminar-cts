package ro.ase.cts.clase;

public class DepartamentFinanciar {
	private int nrAngajati;
	private String director;
	private double salariulDeBaza;
	
	private static DepartamentFinanciar departamentFinanciar =null;
	
	private DepartamentFinanciar(int nrAngajati,String director,double salariulDeBaza)
	{
		this.nrAngajati=nrAngajati;
		this.director=director;
		this.salariulDeBaza=salariulDeBaza;
	}
	
	public static synchronized DepartamentFinanciar getInstance(int nrAngajati,String director,double salariulDeBaza)
	{
		if(departamentFinanciar==null)
			departamentFinanciar=new DepartamentFinanciar(nrAngajati, director, salariulDeBaza);
		return departamentFinanciar;
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
		builder.append("DepartamentFinanciar [nrAngajati=");
		builder.append(nrAngajati);
		builder.append(", director=");
		builder.append(director);
		builder.append(", salariulDeBaza=");
		builder.append(salariulDeBaza);
		builder.append("]");
		return builder.toString();
	}

}
