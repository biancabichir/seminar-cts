package ro.ase.cts.prototype;

public class Program {

	public static void main(String[] args) {
		ContClient client1=new ContClient("Popescu",18);
		ContClient client2=(ContClient)client1.copiaza();
		System.out.println(client1);
		System.out.println(client2);
		
		Bilet bilet1=new Bilet(0,"Arsenal","Barcelona","1aprilie","0");
		Bilet bilet2=new Bilet(1,"Dinamo","UCluj","2aprilie","1");
		
		Bilet bilet3=(Bilet)bilet1.copiaza();
		bilet3.setCodBilet(5);
		bilet3.setLoc("1F");
		
		Bilet bilet4=(Bilet)bilet1.copiaza();
		bilet4.setCodBilet(6);
		bilet4.setLoc("2F");
		
		System.out.println(bilet3.toString());
		System.out.println(bilet4.toString());
		
	}

}
