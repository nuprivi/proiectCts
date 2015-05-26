package clase;

public class Echipa {
private Angajat subaltern;
private Angajat leader;
public Angajat getSubaltern() {
	return subaltern;
}
public void setSubaltern(Angajat subaltern) {
	this.subaltern = subaltern;
}
public Angajat getLeader() {
	return leader;
}
public void setLeader(Angajat leader) {
	this.leader = leader;
}
public boolean checkStatus()
{
	if(this.subaltern.getCodAngajat().charAt(8)=='1'|| this.leader.getCodAngajat().charAt(8)=='2')
		return false;
		else return true;
}
public double diferentaSalariu()
{
	if(leader.getMonthlySalary()>subaltern.getMonthlySalary())
		return leader.getMonthlySalary()-subaltern.getMonthlySalary();
	else 
		return subaltern.getMonthlySalary()-leader.getMonthlySalary();
}

}
