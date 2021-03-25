package ro.ase.cts.FactoryMethod;

public class Asistent extends PersonalSpital{

	public Asistent(String nume, int salariu) {
		super(nume, salariu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Asistent [getNume()=");
		builder.append(getNume());
		builder.append(", getSalariu()=");
		builder.append(getSalariu());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
