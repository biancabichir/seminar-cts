package ro.ase.cts.builder;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare=new RezervareBuilder().setAreBauturaRacoritoare(true).setCodRezervare(1).build();
		Rezervare rezervare1=new RezervareBuilder().setAreMancareInclusa(true).setCodRezervare(2).build();
		System.out.println(rezervare.toString());
		System.out.println(rezervare1.toString());
		
		RezervareBuilder builder=new RezervareBuilder().setAreBauturaRacoritoare(true);
		Rezervare rezervare3=builder.build();
		Rezervare rezervare4=builder.setCodRezervare(100).build();
		System.out.println(rezervare3.toString());
		System.out.println(rezervare4.toString());

	}

}
