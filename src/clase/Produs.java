package clase;

import Exceptii.FloatingValueException;
import Exceptii.NegativeValueException;
import Exceptii.ZeroValueException;

public class Produs {
private String denumire;
private double pret;
public int an_fabricatie;

public double calculPret(double cantitate) throws FloatingValueException, ZeroValueException, NegativeValueException
{if(cantitate<0.0)
	throw new NegativeValueException();
if(cantitate==0)
	throw new ZeroValueException();
String valoare=cantitate+"";
if(valoare.indexOf(".")<valoare.length()-3)
	throw new FloatingValueException();

	this.pret=pret*cantitate;
	return this.pret;
}
public double getPret()
{
	return this.pret;
}
public double calculPretCuTVA(double TVA) throws NegativeValueException, ZeroValueException 
{ 
	if(TVA<0)
		throw new NegativeValueException();
		this.pret=this.pret*TVA;
		if(TVA==0)
			throw new ZeroValueException();
		
	return this.pret;
}
public boolean isLuxuryProduct(Produs p, double cantitate )
{  double pretFinal=p.pret*cantitate;
	if(pretFinal>100)
		return true;
	else return false;
}
public Produs(String den)
{
	this.denumire=den;
}
public String getDenumire()
{
	System.out.println(this.denumire);
	return this.denumire;
}
public Produs(double pret)
{this.pret=pret;}


public Produs schimbarePret(Produs p, double pretul_nou)
{
    p.pret=pretul_nou;
    return p;
}
public Produs schimbareDenumire(Produs p, String denumire_noua)
{
	p.denumire=denumire_noua;
	return p;
}
public double CalculRaportCalitatePret(double calitate ) throws ZeroValueException, NegativeValueException, FloatingValueException, BigValuesException
{
	if(calitate==0)
		throw new ZeroValueException();
	if(calitate<0)
		throw new NegativeValueException();
	String valoare=calitate+"";
	if(valoare.indexOf(".")<valoare.length()-3)
		throw new FloatingValueException();
     if(calitate>10000)
    	 throw new BigValuesException();
	return pret/calitate;
}
public double TermenValabilitate(double an) throws NegativeValueException, ZeroValueException, FloatingValueException
{  if(an<0)
	throw new NegativeValueException();
   if(an==0)
	   throw new ZeroValueException();
   String valoare=an+"";
	if(valoare.indexOf(".")<valoare.length()-3)
		throw new FloatingValueException();
	return an-an_fabricatie;
}
public double DiferentaPretProduse(Produs p) throws NegativeValueException, ZeroValueException, FloatingValueException, BigValuesException
{ if(p.pret<0)
	throw new NegativeValueException();
if(p.pret==0)
	   throw new ZeroValueException();
String valoare=p.pret+"";
	if(valoare.indexOf(".")<valoare.length()-3)
		throw new FloatingValueException();
	if(p.pret>100000)
		throw new BigValuesException();
	if(this.pret<p.pret)
		return p.pret-this.pret;
	else return this.pret-p.pret;
}
}
