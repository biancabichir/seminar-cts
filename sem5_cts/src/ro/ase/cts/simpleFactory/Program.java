package ro.ase.cts.simpleFactory;

public class Program {
	public static void main(String[] args)
	{
		try {
			
		//FactoryPersonal factory=new FactoryPersonal();
			
		PersonalSpital personal1;
		PersonalSpital personal2;
		
		personal1=FactoryPersonal.createPersonal(TipPersonal.Medic, "ion", 1500);
		personal2=FactoryPersonal.createPersonal(TipPersonal.Asistent, "maria", 1300);
		System.out.println(personal1);
		System.out.println(personal2);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
