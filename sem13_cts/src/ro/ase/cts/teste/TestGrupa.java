package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class TestGrupa {
	private Grupa grupa;
	
	@Before
	public void Setup() {
		grupa=new Grupa(1077);
		for(int i=0;i<10;i++) {
			Student student=new Student("ALEX");
			student.adaugaNota(5);
			student.adaugaNota(7);
			student.adaugaNota(4);
			grupa.adaugaStudent(student);
		}
	}
	
	@Test
	public void testGetPromovabilitate() {
		Student studentA=new Student("Alex");
		studentA.adaugaNota(10);
		studentA.adaugaNota(10);
		
		Student studentM=new Student("MARIA");
		studentM.adaugaNota(10);
		studentM.adaugaNota(10);
		
		grupa.adaugaStudent(studentA);
		grupa.adaugaStudent(studentM);
		
		double delta=0.05;
		assertEquals(0.16, grupa.getPromovabilitate(),delta);
		
	}
	
	@Test
	public void testGetPromovabilitateLBoundary() {
		assertEquals(0, grupa.getPromovabilitate(),0.05);
	}
	
	@Test(timeout=500)
	public void testGetPromovabilitatePerformance() {
		grupa.getPromovabilitate();
	}
	
	@Test
	public void testGetPromovabilitateUBoundary() {
		Grupa grNoua=new Grupa(1076);
		Student student=new Student("Ion");
		student.adaugaNota(10);
		student.adaugaNota(10);
		
		Student student1=new Student("Ioana");
		student.adaugaNota(8);
		student.adaugaNota(7);
		
		grNoua.adaugaStudent(student);
		grNoua.adaugaStudent(student1);
		assertEquals(1, grNoua.getPromovabilitate(),0.05);
		
	}
	
    @Test(expected=IllegalArgumentException.class)
    public void testGetPromovabilitateError() {
    	Grupa grNoua=new Grupa(1080);
    	grNoua.getPromovabilitate();
    }
    
	@Test
	public void testRightConstructor() {
		Grupa grupa=new Grupa(1077);
		assertEquals(1077, grupa.getNrGrupa());
	}
	
	@Test
	public void testBoundaryLIConstructor() {
		Grupa grupa=new Grupa(1000);
		assertEquals(1000,grupa.getNrGrupa());
	}

	@Test
	public void testBoundaryLSConstructor() {
		Grupa grupa=new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testErrorInfConstructor() {
		Grupa grupa=new Grupa(100);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testErrorSupConstructor() {
		Grupa grupa=new Grupa(11100);
	}
	
	@Test(timeout=500)
	public void testPerformanceConstructor() {
		Grupa grupa=new Grupa(1077);		
	}
	
	@Test
	public void testExistenceConstructor() {
		Grupa grupa=new Grupa(1077);
		assertNotNull(grupa.getStudenti());
	}
}
