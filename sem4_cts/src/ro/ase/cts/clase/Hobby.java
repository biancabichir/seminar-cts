package ro.ase.cts.clase;

public class Hobby {
	private String denumire;
	private int durata;
	private String ziDesfasurare;
	
    private static Hobby hobby =null;
	
	private Hobby(String denumire,int durata,String ziDesfasurare)
	{
		this.denumire=denumire;
		this.durata=durata;
		this.ziDesfasurare=ziDesfasurare;
	}
	
	public static synchronized Hobby getInstance(String denumire,int durata,String ziDesfasurare)
	{
		if(hobby==null)
			hobby=new Hobby(denumire,durata,ziDesfasurare);
		return hobby;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public void setZiDesfasurare(String ziDesfasurare) {
		this.ziDesfasurare = ziDesfasurare;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hobby [denumire=");
		builder.append(denumire);
		builder.append(", durata=");
		builder.append(durata);
		builder.append(", ziDesfasurare=");
		builder.append(ziDesfasurare);
		builder.append("]");
		return builder.toString();
	}

}
