package Teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAngajat.class, TestComenzi.class, TestEchipa.class,
		TestProdus.class })
public class AllTests {

}
