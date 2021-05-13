package ro.ase.cts.observer;

public class Program {

	public static void main(String[] args) {
		Observer o1=new ClientFidel("Ana");
		Observer o2=new ClientFidel("Alex");
		Observer o3=new ClientFidel("Andrei");
		
		ManagerSala manager=new ManagerSala();
		manager.adaugaAbonat(o1);
		manager.adaugaAbonat(o2);
		manager.adaugaAbonat(o3);
		
		manager.anuntaMeci("Fotbal");
		
		System.out.println("-----");
		manager.stergeAbonat(o1);
		manager.anuntaMeci("Handbal");
		
	}

}
