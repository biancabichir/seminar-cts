package ro.ase.cts.facade;

import java.time.LocalDate;

public class Persoana {
private String nume;
private String cnp;
public Persoana(String nume, String cnp) {
	super();
	this.nume = nume;
	this.cnp = cnp;
}
public String getNume() {
	return nume;
}
public void setNume(String nume) {
	this.nume = nume;
}
public String getCnp() {
	return cnp;
}
public void setCnp(String cnp) {
	this.cnp = cnp;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Persoana [nume=");
	builder.append(nume);
	builder.append(", cnp=");
	builder.append(cnp);
	builder.append("]");
	return builder.toString();
}
//an=(1900 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2)));
public int getVarsta() {
	return (LocalDate.now().getYear()-1900+Integer.parseInt(""+cnp.charAt(1)+cnp.charAt(2)));
}

}
