package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categorii.TesteGetPromovabilitate;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.testeDubluri.StudentStub;

public class TestGrupaWithStudentStub {
	

	@Test
	@Category({TesteGetPromovabilitate.class})
	public void testGetPromovabilitate() {
		Grupa grupa=new Grupa(1077);
		IStudent studentStub=new StudentStub();
		IStudent studentStub2=new StudentStub();
		grupa.adaugaStudent(studentStub);
		grupa.adaugaStudent(studentStub2);
		assertEquals(1,grupa.getPromovabilitate(),0.01);
		
	}

}
