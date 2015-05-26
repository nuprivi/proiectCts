package Teste;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Exceptii.FloatingValueException;
import Exceptii.NegativeValueException;
import Exceptii.ProdusException;
import Exceptii.ZeroValueException;
import clase.Comenzi;
import clase.Produs;

public class TestComenzi {
	static String line="E:/ProiectCTS/src/Text.txt";
	static FileReader inputFile;
	static BufferedReader bufferReader;
	public static int contor = 12;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		inputFile = new FileReader(line);
		bufferReader = new BufferedReader(inputFile);
	}

	@Test
	public void test() {
		System.out.println("Test cu valori citite din fisier");
		
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("testdown");
		inputFile.close();
		bufferReader.close();
	}

	@Before
	public void setUp() throws Exception {

		
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("teardown");

	}
	@Test
	public void TestValoareComandaFalse() 
	{
		Comenzi com = new Comenzi();
		
		
		try {
			boolean rez = com.ComandaMare(80);
		
		assertTrue(rez);
		}
		catch(ProdusException ex)
		{
			assertFalse(true);
		}
	
	}
	@Test
	public void TestValoareComanda2()
	{
		Comenzi com = new Comenzi();
		try{boolean rezultat = com.ComandaMare(100000);
		assertFalse(rezultat);}
		catch(ProdusException ex)
		{
			assertTrue(true);
		}
		
	}
	@Test
	public void ValoareComandaTestCuValoriFisier() {
	       try{
	          while ((line = bufferReader.readLine()) != null)   {
	            line = bufferReader.readLine();
	            boolean rez = !line.split(" ")[0].equals("0");
	            double number = Double.parseDouble(line.split(" ")[1]);
	            System.out.println("Test: "+number + " get: "+rez);
	            assertEquals("Eroare la "+rez+" cu "+number, rez, new Comenzi().ComandaMare(number));
	          }
	       }catch(Exception e){
	          System.out.println("Error while reading file line by line:" + e.getMessage());                      
	       }
	}
	@Test
	public void testIdComanda()
	{
		Comenzi comanda=new Comenzi();
		comanda.setIdComanda(100);
		Comenzi com=comanda.schimbareIdAngajat(comanda, 200);
		assertSame(com, comanda);
	}
	@Test 
	public void TestSchimbareProdus()
	{
		Comenzi comanda=new Comenzi();
		Produs p=new Produs(150);
		
		
		Comenzi com=comanda.schimbare_produs(comanda, p);
		assertSame(com, comanda);
	}
	
	

}
