package ro.ase.cts.FactoryMethod;

public class Anestezist extends PersonalSpital{

	public Anestezist(String nume, int salariu) {
		super(nume, salariu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Anestezist [getClass()=");
		builder.append(getClass());
		builder.append(", getNume()=");
		builder.append(getNume());
		builder.append(", getSalariu()=");
		builder.append(getSalariu());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	

}
