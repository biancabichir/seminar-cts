package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categorii.TesteGetPromovabilitate;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.testeDubluri.StudentFake;

public class TestGrupaWithFake {

	@Test
	@Category({TesteGetPromovabilitate.class})
	public void testPromovabiliateAreRestante() {
		Grupa grupa=new Grupa(1077);
		for(int i=0;i<8;i++) {
			StudentFake studentFake=new StudentFake();
			studentFake.setAreRestante(false);
			grupa.adaugaStudent(studentFake);
		}
		for(int i=0;i<8;i++) {
			StudentFake studentFake2=new StudentFake();
			studentFake2.setAreRestante(true);
			grupa.adaugaStudent(studentFake2);
		}
	}

}
