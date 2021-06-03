package ro.ase.cts.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.teste.TestGrupaWithFake;
import ro.ase.cts.teste.TestGrupaWithStudentDummy;
import ro.ase.cts.teste.TestGrupaWithStudentStub;

@RunWith(Suite.class)
@SuiteClasses({TestGrupaWithStudentDummy.class,TestGrupaWithStudentStub.class,TestGrupaWithFake.class})
public class AllTests {

}
