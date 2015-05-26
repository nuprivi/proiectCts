package Teste;

import org.junit.Test;

import Exceptii.FloatingValueException;
import Exceptii.NegativeValueException;
import Exceptii.ProdusException;
import Exceptii.ZeroValueException;
import clase.Angajat;
import clase.BigValuesException;
import junit.framework.TestCase;

public class TestAngajat extends TestCase {
	
Angajat employee=new Angajat();

public void testCalculateAppriasal() {
    employee.setName("Rajeev");
    employee.setMonthlySalary(8000);
    double appraisal= employee.calculateAppraisal(employee);
    assertEquals(500, appraisal, 0.0);
 }
public void testCalculateNegativeValue()
{
	employee.setName("John");
	employee.setMonthlySalary(-2000);
	double appraisal=employee.calculateAppraisal(employee);
	assertEquals(500, appraisal,0.0);
}
public void testCalculateZeroValue()
{
	employee.setName("John");
	employee.setMonthlySalary(0);
	double appraisal=employee.calculateAppraisal(employee);
	assertEquals(500, appraisal,0.0);
}
public void testCalculateFloatingValue()
{
	employee.setName("John");
	employee.setMonthlySalary(0.0001);
	double appraisal=employee.calculateAppraisal(employee);
	assertEquals(500, appraisal,0.0);
}

 // test to check yearly salary

 public void testCalculateYearlySalary() throws NegativeValueException, ZeroValueException, FloatingValueException {
    employee.setName("Rajeev");
    employee.setMonthlySalary(8000);
    double salary= employee.calculateYearlySalary(employee);
    assertEquals(96000, salary, 0.0);
 }
 
 public void testCalculateNegativeYearlySalary(){
	 try{
			employee.setMonthlySalary(-200);
		    employee.calculateYearlySalary(employee);
			assertFalse("metoda nu arunca exceptie pe valori negative",true);
		}
		catch(ProdusException ex)
		{
			assertTrue(true);
		}
}
 
public void testCalculateFloatingYearlySalary(){
	 try{
			employee.setMonthlySalary(0.0001);
		    employee.calculateYearlySalary(employee);
			assertFalse("metoda nu arunca exceptie pe valori negative",true);
		}
		catch(ProdusException ex)
		{
			assertTrue(true);
		}
}

public void testCalculateGrowSalary(){
    employee.setName("Rajeev");
    employee.setMonthlySalary(8000);
    double appraisal= employee.CalculateSalaryGrow(employee);
    assertEquals(2000, appraisal, 0.0);
 }

public void testCalculateNegativeGrowSalary(){
	try{
		employee.setMonthlySalary(-8000);
	    employee.calculateYearlySalary(employee);
		assertFalse("metoda nu arunca exceptie pe valori negative",true);
	}
	catch(ProdusException ex ){
		assertTrue(true);
	}
 }
public void testCalculateZeroGrowSalary(){
	try{
		employee.setMonthlySalary(0);
	    employee.calculateYearlySalary(employee);
		assertFalse("metoda nu arunca exceptie pe valori negative",true);
	}
	catch(ProdusException ex ){
		assertTrue(true);
	}
}

public void testCalculateFloatingGrowSalary() {
	try{
		employee.setMonthlySalary(0.0001);
	    employee.calculateYearlySalary(employee);
		assertFalse("metoda nu arunca exceptie pe valori negative",true);
	}
	catch(ProdusException ex ){
		assertTrue(true);
	}
 }

public void testAngajatSchimbareSalariu(){
	Angajat a=new Angajat();
	a.setMonthlySalary(2500);
	Angajat ang=a.SchimbaSalariu(a, 3000);
	assertSame(ang, a);
}

public void testCodAngajat(){
	Angajat a=new Angajat();
	a.setCodAngajat("a1805812025");
	assertFalse("a1805812025",a.checkCodAngajat());
}


@Test
public void testSex() {
	Angajat a=new Angajat();
	a.setCodAngajat("a1805812025");
	assertEquals("M", a.getSex());
}

@Test
public void testSex2() {
	Angajat p=new Angajat();
	p.setCodAngajat("b1805812025");
	char rezultat=p.getCodAngajat().charAt(0);
	
	if(rezultat=='a'|| rezultat=='c')
	assertEquals("M", p.getSex());
	else 
		assertEquals("F", p.getSex());

}

@Test 
public void testSalariuSiComisionNormalValue() throws FloatingValueException, ZeroValueException, NegativeValueException, BigValuesException{  
	employee.setMonthlySalary(1000);
	employee.SalariuSiComision(0.25);
	assertEquals(1250.0,employee.getMonthlySalary());
}
public void testSalariuSiComisionNegativeValue(){  
   try{
	   employee.setMonthlySalary(1000);
	   employee.SalariuSiComision(-0.25);
	   assertFalse("metoda nu arunca exceptii cu valori negative",true);
	   }
   catch(ProdusException ex)
   {
	   assertTrue(true);
   }
   
}
public void testSalariuSiComisionZeroValue()
{  
   try{
	   employee.setMonthlySalary(1000);
	   employee.SalariuSiComision(0);
	   assertFalse("metoda nu arunca exceptii pe 0",true);}
   catch(ProdusException ex)
   {
	   assertTrue(true);
   }
}
public void testSalariuSiComisionFloatingValue()
{  
   try{
	   employee.setMonthlySalary(1000);
	   employee.SalariuSiComision(0.0006);
	   assertFalse("metoda nu arunca exceptii cu valori negative",true);}
   catch(ProdusException ex)
   {assertTrue(true);}
   
}

public void testSalariuSiComisionBigValue(){  
   try{
	   employee.setMonthlySalary(1000);
	   employee.SalariuSiComision(6553500);
	   assertFalse("metoda nu arunca exceptii cu valori mari",true);}
   catch(ProdusException ex)
   {assertTrue(true);}
   
}


}



