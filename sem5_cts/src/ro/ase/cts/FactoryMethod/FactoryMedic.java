package ro.ase.cts.FactoryMethod;

public class FactoryMedic implements FactoryPersonal{

	@Override
	public PersonalSpital createPersonal(String nume, int salariu) {
		// TODO Auto-generated method stub
		return new Medic(nume,salariu);
	}

}
