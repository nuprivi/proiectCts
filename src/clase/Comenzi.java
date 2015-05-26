package clase;

import Exceptii.FloatingValueException;
import Exceptii.NegativeValueException;
import Exceptii.ZeroValueException;

public class Comenzi {

private int idComanda;
private Produs produs;

private Angajat a;

public int getIdComanda() {
	return idComanda;
}
public void setIdComanda(int idComanda) {
	this.idComanda = idComanda;
}
public void setProdus(Produs produs)
{
	this.produs=produs;
	
}
public Produs getProdus()
{
	return this.produs;
}
public Angajat getA() {
	return a;
}
public void setA(Angajat a) {
	this.a = a;
}
public Comenzi()
{
	this.idComanda=0;
	this.a=new Angajat();
	this.produs=new Produs(10);
}
public boolean ComandaMare(double cantitate) throws FloatingValueException, ZeroValueException, NegativeValueException
{
	double valoare=(double)this.produs.calculPret(cantitate);
	return ((valoare>500 && valoare<1000));
}
public Comenzi schimbareIdAngajat(Comenzi c,int idComanda)
{
	c.idComanda=idComanda;
	return c;
}
public Comenzi schimbare_produs(Comenzi c, Produs p)
{
	c.produs=p;
	return c;
}

}
