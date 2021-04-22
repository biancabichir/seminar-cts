package ro.ase.cts.facade;

public class BirouCredite {
	public static boolean areCredite(Persoana p) {
		 int cifra=Integer.parseInt(""+p.getCnp().charAt(12));
		 return cifra%2==0;

}
}
