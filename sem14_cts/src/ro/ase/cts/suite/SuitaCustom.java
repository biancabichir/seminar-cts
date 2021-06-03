package ro.ase.cts.suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.categorii.TesteGetPromovabilitate;
import ro.ase.cts.categorii.TesteNormale;
import ro.ase.cts.teste.TestGrupa;
import ro.ase.cts.teste.TestGrupaCuFixture;
import ro.ase.cts.teste.TestGrupaWithFake;
import ro.ase.cts.teste.TestGrupaWithStudentDummy;
import ro.ase.cts.teste.TestGrupaWithStudentStub;

@RunWith(Categories.class)
@SuiteClasses({TestGrupaWithFake.class,TestGrupaWithStudentDummy.class,TestGrupaWithStudentStub.class,TestGrupa.class,TestGrupaCuFixture.class,AllTests.class})
@ExcludeCategory({TesteNormale.class})
@IncludeCategory({TesteGetPromovabilitate.class})
public class SuitaCustom {

}
