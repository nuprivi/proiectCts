package Teste;

import org.junit.Test;

import Exceptii.FloatingValueException;
import Exceptii.NegativeValueException;
import Exceptii.ProdusException;
import Exceptii.ZeroValueException;
import clase.BigValuesException;
import clase.Produs;
import junit.framework.TestCase;

public class TestProdus extends TestCase {
	Produs p=null;
	public final void setUp()
	{
		System.out.println("setUp unit test");
		p=new Produs(100.00);
		
	}
	@Test
	public void testNormalValuesPrice() throws NegativeValueException, ZeroValueException, FloatingValueException {
		//definire valori 
		double expected=20000;
		p.calculPret(200.0);
		assertEquals("Test calcul produs cu valori normale",20000,p.getPret(),0.0);
	}
	@Test
	public void testValoriNegative(){
		//definire valori 
		
		
	try{
		p.calculPret(-200.0);
		assertFalse("metoda nu arunca exceptie pe valori negative",true);
	}
	catch(ProdusException ex)
	{
		assertTrue(true);
	}
	
	
		
	}
	@Test
	public void testZeroValueProdus()
	{
		
		try{
			p.calculPret(0);
			assertFalse("metoda nu arunca exceptie pe 0",true);
		}
		catch(ProdusException ex)
		{
			assertTrue(true);
		}
	}
	@Test
	public void testFloatingValueProdus()
	{
		
		try{
			p.calculPret(0.0006);
			assertFalse("metoda nu arunca exceptie pe 0",true);
		}
		catch(ProdusException ex)
		{
			assertTrue(true);
		}
	}
	public void testNormalValuesTVA() throws NegativeValueException, ZeroValueException 
	{
		
		p.calculPretCuTVA(0.19);
		assertEquals("Test pentru valori normale", 19.00,p.getPret(),0.0);
				
	}
	@Test 
	public void testNegativeValueTVA() 
	{
		try{
			p.calculPretCuTVA(-0.2);
			assertFalse("metoda nu arunca exceptie pe valori negative",true);
		}
		catch(ProdusException ex)
		{
			assertTrue(true);
		}
		
		
				
	}

	@Test
	public void testFloatingValueTVA()
	{
		
		try{
			p.calculPret(0.000001);
			assertFalse("metoda nu arunca exceptie pe 0",true);
		}
		catch(ProdusException ex)
		{
			assertTrue(true);
		}
	}
	public void testProduseSchimbarePret()
	{
		Produs p=new Produs(25);
		Produs prod=p.schimbarePret(p,30);
		assertSame(prod, p);
	}
	public void testSchimbareDenumire()
	{
		Produs p=new Produs("Poiana cu alune");
		Produs prod=p.schimbareDenumire(p, "Poiana cu alune si lapte");
		assertSame(prod, p);
	}
	public void testCalitatePretNormalValues() throws FloatingValueException, ZeroValueException, NegativeValueException, BigValuesException
	{
	    p.calculPret(10);
		p.CalculRaportCalitatePret(10.00);
		assertEquals("Test calcul produs cu valori normale",1000.00,p.getPret(),0.0);
	}
	
	public void testCalitatePretZeroValueProdus()
	{
		
		try{
			p.CalculRaportCalitatePret(0);
			assertFalse("metoda nu arunca exceptie pe 0",true);
		}
		catch(ProdusException ex)
		{
			assertTrue(true);
		}
	}
	
	public void testCalitatePretFloatingValueProdus()
	{
		
		try{
			p.CalculRaportCalitatePret(0.006);
			assertFalse("metoda nu arunca exceptie pe valori aberante",true);
		}
		catch(ProdusException ex)
		{
			assertTrue(true);
		}
	}
	@Test
	public void testCalitatePretBigValueProdus()
	{
		
		try{
			p.CalculRaportCalitatePret(35555550);
			assertFalse("metoda nu arunca exceptie pe valori aberante",true);
		}
		catch(ProdusException ex)
		{
			assertTrue(true);
		}
	}
	@Test
	public void testDataExpirareValoriNormal() throws NegativeValueException, ZeroValueException, FloatingValueException
	{
		p.TermenValabilitate(2015);
		p.an_fabricatie=2013;
		assertEquals("Test pentru valori normale", 2, p.TermenValabilitate(2015),0.0);
	}
	
	@Test
	public void testDataExpirareValoriNegative() {
		//definire valori 
		try{
			p.TermenValabilitate(-2015);
			assertFalse("metoda nu arunca exceptii pe valori negative", true);
		}
		catch(ProdusException ex)
		{
			assertTrue(true);
		}
		
		
	
		
	}
	public void testTermenDeValabilitateZeroValueProdus()
	{
		
		try{
			p.TermenValabilitate(0);
			assertFalse("metoda nu arunca exceptie pe 0",true);
		}
		catch(ProdusException ex)
		{
			assertTrue(true);
		}
	}
	
	public void testTermenValabilitateFloatingValue()
	{
		
		try{
			p.TermenValabilitate(0.0006);
			assertFalse("metoda nu arunca exceptie pe valori aberante",true);
		}
		catch(ProdusException ex)
		{
			assertTrue(true);
		}
	}
	@Test
	public void testTermenValabilitateBigValues()
	{
		
		try{
			p.TermenValabilitate(35555550);
			assertFalse("metoda nu arunca exceptie pe valori aberante",true);
		}
		catch(ProdusException ex)
		{
			assertTrue(true);
		}
	}
	
	@Test
	public void testDiferentaPretValoriNormale() throws NegativeValueException, ZeroValueException, FloatingValueException, BigValuesException 
	{Produs prod=new Produs(150);
		p.DiferentaPretProduse(prod);

		assertEquals("Test pentru valori normale", 50, p.DiferentaPretProduse(prod),0.0);
	}
	
	@Test
	public void testDiferentaPretValoriNegative() {
		//definire valori 
		try{
			Produs prod=new Produs(-150);
			p.DiferentaPretProduse(prod);
			assertFalse("metoda nu arunca exceptii pe valori negative", true);
		}
		catch(ProdusException ex)
		{assertTrue(true);}
		
		
		
	
		
	}
	public void testDIferentaPretZeroValueProdus()
	{
		
		try{Produs prod=new Produs(0);
		p.DiferentaPretProduse(prod);
			
			assertFalse("metoda nu arunca exceptie pe 0",true);
		}
		catch(ProdusException ex)
		{
			assertTrue(true);
		}
	}
	
	public void testDiferentaPretFloatingValue()
	{
		
		try{
			Produs prod=new Produs(0.0006);
			p.DiferentaPretProduse(prod);
			assertFalse("metoda nu arunca exceptie pe valori aberante",true);
		}
		catch(ProdusException ex)
		{
			assertTrue(true);
		}
	}
	@Test
	public void testDiferentaPretBigValues()
	{
		
		try{
			Produs prod=new Produs(65535000);
			p.DiferentaPretProduse(prod);
			assertFalse("metoda nu arunca exceptie pe valori aberante",true);
		}
		catch(ProdusException ex)
		{
			assertTrue(true);
		}
}
	
}

