package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;

public class TestGrupa {

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
