package ro.ase.cts.template;

public class Program {

	public static void main(String[] args) {
		Spectator s1=new Spectator("Anderi");
		SpectatorAbstract s2=new Spectator("Alex");
		s1.intrareSpectatorStadion();
		System.out.println("------------");
		s2.intrareSpectatorStadion();
		
		SpectatorAbstract sv1=new SpectatorVip("Ionescu");
		sv1.intrareSpectatorStadion();

	}

}
