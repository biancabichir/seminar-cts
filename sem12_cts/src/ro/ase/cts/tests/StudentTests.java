package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTests {
	Student student=null;
	
	@Before
	public void setUp() {
	  student=new Student();
	}

	@Test
	public void testApelConstructorCuParametru() {
		String nume="Ion";
		Student student=new Student(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testApelConstructorFaraParametru() {
		String nume="Student";
		Student student=new Student();
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testInitializareListaConstructorFaraParametru() {
		//Student student=new Student();
		assertNotNull(student.getNote());
	}
	
	@Test 
	public void testAdaugareNotaInLista() {
		//Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
    
	@Test
	public void testMarimeListaCorecta() {
		//Student student=new Student();
		int nota=7;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testSetareNume() {
		//Student student=new Student();
		String nume="Popescu";
		student.setNume(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testareCalculMedie() {
		int nota1=8;
		int nota2=7;
		student.adaugaNota(7);
		student.adaugaNota(8);
		float medie=(nota1+nota2)/2.0f;
		assertEquals(medie, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testCalculMedieFaraNote() {
		assertEquals(0,student.calculeazaMedie(),0.01);
	}
	
	@Test
	public void testCalculeazaMediePentruNota() {
		int nota=0;
		student.adaugaNota(nota);
		assertEquals(nota, student.calculeazaMedie(),0.01);
	}
	
	@Test
	public void verificareRestante() {
		int nota=6;
		int nota1=3;
		student.adaugaNota(nota1);
		student.adaugaNota(nota);
		assertTrue(student.areRestante());
		
	}
	
	@Test
	public void verificareNuAreRestante() {
		int nota=6;
		int nota1=5;
		student.adaugaNota(nota1);
		student.adaugaNota(nota);
		assertFalse(student.areRestante());
		
	}
	@Test
	public void verificareRestanteFaraNote() {
		assertFalse(student.areRestante());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testVerficareAruncareExceptie() {
		int index=-1;
		student.getNota(index);
	}
	
	//pt JUnit3
	@Test
	public void testGetNotaShouldThrowException() {
		//1
		try {
			//2
			student.getNota(-1);
			fail("Nu trebuia sa ajungem aici");
			//3
		}catch(IndexOutOfBoundsException err) {
	//4	
	}
	//5
}
}
