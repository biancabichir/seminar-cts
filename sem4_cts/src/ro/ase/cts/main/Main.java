package ro.ase.cts.main;

import ro.ase.cts.clase.DepartamentFinanciar;
import ro.ase.cts.clase.DepartamentFinanciarEager;
import ro.ase.cts.clase.Hobby;

public class Main {

	public static void main(String[] args) {
		DepartamentFinanciarEager primulDepartamentFinanciarEager=DepartamentFinanciarEager.getInstance();
		DepartamentFinanciarEager alDoileaDepartamentFinanciarEager=DepartamentFinanciarEager.getInstance();
		
		primulDepartamentFinanciarEager.setDirector("Gigel");
		alDoileaDepartamentFinanciarEager.setNrAngajati(20);
		
		System.out.println(primulDepartamentFinanciarEager.toString());
		System.out.println(alDoileaDepartamentFinanciarEager.toString());
		
		DepartamentFinanciar primulDepartamentFinanciar=DepartamentFinanciar.getInstance(10,"Ionescu", 2500);
		DepartamentFinanciar alDoileaDepartamentFinanciar=DepartamentFinanciar.getInstance(20,"Popescu",2500);
		
		System.out.println(primulDepartamentFinanciar.toString());
		System.out.println(alDoileaDepartamentFinanciar.toString());
		
		Hobby hobby1=Hobby.getInstance("tenis",90,"sambata");
		Hobby hobby2=Hobby.getInstance("alergat",30,"vineri");
		
		System.out.println(hobby1.toString());
		System.out.println(hobby2.toString());

	}

}
