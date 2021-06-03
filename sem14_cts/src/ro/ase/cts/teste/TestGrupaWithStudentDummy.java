package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.testeDubluri.StudentDummy;

public class TestGrupaWithStudentDummy {

	@Test
	public void testAdaugaStudent() {
		IStudent student=new StudentDummy();
		Grupa grupa=new Grupa(1077);
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getStudenti().size(),0.01);
	}

}
