package ro.ase.cts.testeDubluri;

import java.util.List;

import ro.ase.cts.clase.IStudent;

public class StudentStub implements IStudent{

	@Override
	public String getNume() {
		return "Alex";
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		return 9.8f;
	}

	@Override
	public int getNota(int index) {		
		return 7;
	}

	@Override
	public boolean areRestante() {
		return false;
	}

}
