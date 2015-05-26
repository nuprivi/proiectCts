package clase;

import Exceptii.FloatingValueException;
import Exceptii.NegativeValueException;
import Exceptii.ZeroValueException;

public class Angajat {
private String name;
private String codAngajat;
private double monthlySalary;
public double vechime;

public String getCodAngajat(){
	return this.codAngajat;
}

public void setCodAngajat(String CNP){
	this.codAngajat=CNP;
}

public String getName(){
	return name;
}
public Angajat SchimbaSalariu(Angajat a, double salariul_nou)
{
	a.monthlySalary=salariul_nou;
	return a;
}

public void setName(String name){
	this.name = name;
}

public double getMonthlySalary(){
	return monthlySalary;
}

public void setMonthlySalary(double monthlySalary){
	this.monthlySalary = monthlySalary;
}

public double calculateYearlySalary(Angajat employeeDetails) throws NegativeValueException, ZeroValueException, FloatingValueException{
	
    double yearlySalary=0;
    
    if(monthlySalary<0.00)
    {throw new NegativeValueException();}
    if(monthlySalary==0.00)
    {throw new ZeroValueException();}
    String valoare=monthlySalary+"";
    if(valoare.indexOf(".")<valoare.length()-3)
    	throw new FloatingValueException();
    yearlySalary = employeeDetails.getMonthlySalary() * 12;
    return yearlySalary;
 }
	
 // Calculate the appraisal amount of employee
 public double calculateAppraisal(Angajat employeeDetails){
    double appraisal=0;
    if(employeeDetails.getMonthlySalary() < 10000){
       appraisal = 500;
    }else{
       appraisal = 1000;
    }
    return appraisal;
 }
 public double CalculateSalaryGrow(Angajat a)
 {
	 double finalSalary=0;
	 if(a.vechime<5)
	 {
		 finalSalary=a.getMonthlySalary()*0.25;
	 }
	 if(a.vechime>5 && a.vechime<10)
	 {
		 finalSalary=a.getMonthlySalary()*0.5;
	 }
	 if(a.vechime>10)
	 {
		 finalSalary=a.getMonthlySalary()*0.6;
	 }
	 return finalSalary;
 }
 public String getSex()
 {
	 switch(codAngajat.charAt(0))
	 {
	 case 'a':return "M";
	 case 'b':return "F";
	 case 'c':return "M";
	 case 'd':return "F";
	 }
	 return "N/A";
 }
 public boolean checkCodAngajat(){
		int s=0;
		 String number="a1205671935";
		for(int i=1;i<10;i++){
			s+=Integer.parseInt(""+number.charAt(i))*Integer.parseInt(""+codAngajat.charAt(i));			
		}
		int cifra=s%11;
		if(cifra==10)
			cifra=1;
		return cifra==Integer.parseInt(""+codAngajat.charAt(10));
	}
 public double SalariuSiComision(double comision) throws FloatingValueException, ZeroValueException, NegativeValueException, BigValuesException{
	 if(comision<0.0)
		 throw new NegativeValueException();
	 if(comision==0.0)
		 throw new ZeroValueException();
	 String valoare=comision+"";
	 if(valoare.indexOf(".")<valoare.length()-3)
	    	throw new FloatingValueException();
	 if(comision>1)
		 throw new BigValuesException();
	 this.monthlySalary=monthlySalary*comision+monthlySalary;
	 return this.monthlySalary;
 }
	

}
