package clase;

import java.util.Vector;

public class Produse {
private Vector produse=new Vector();
Produse(Produs p1, Produs p2)
{
	appendProdus(p1);
	appendProdus(p2);
}
public void appendProdus(Produs p)
{
	produse.add(p);
}
Produse(Produs [] prod)
{
	for(int i=0;i<prod.length;i++)
	{
		produse.add(prod[i]);
	}
}
}
