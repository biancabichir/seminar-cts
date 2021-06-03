package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categorii.TesteGetPromovabilitate;
import ro.ase.cts.categorii.TesteNormale;
import ro.ase.cts.categorii.TesteUrgente;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class TestGrupa {
	
	
	@Test
	@Category({TesteGetPromovabilitate.class,TesteNormale.class})
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
    @Category({TesteGetPromovabilitate.class})
    public void testGetPromovabilitateError() {
    	Grupa grNoua=new Grupa(1080);
    	grNoua.getPromovabilitate();
    }
    
	@Test
	@Category({TesteUrgente.class})
	public void testRightConstructor() {
		Grupa grupa=new Grupa(1077);
		assertEquals(1077, grupa.getNrGrupa());
	}
	
	@Test
	@Category({TesteNormale.class})
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
