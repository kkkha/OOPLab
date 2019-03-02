/** Electricity Bill calculation */
class Tariff
{
	private int prev, curr, cno, u;
	double bill;
	String cname, ct;
	public double tariff()
	{
		u = curr-prev;
		double t = 0;
		switch(ct)
		{
			case "Domestic": 
			if(u<=100) t = u*1;
			else if(u<=200) t = 100+(u-100)*2.50;
			else if(u<=500) t = 350+(u-200)*4;
			else t = 1550+(u-500)*6;
			break;
			case "Commercial": 
			if(u<=100) t = u*2;
			else if(u<=200) t = 200+(u-100)*5.50;
			else if(u<=500) t = 650+(u-200)*6;
			else t = 2450+(u-500)*7; 
			break;
		}
		return t;
	}
	public void input(int p, int c, int cn, String cna, String t)
	{	
		prev = p;
		curr = c;
		cno = cn;
		cname = cna;
		ct = t;
	}
	public void output()
	{
		System.out.print(cname+" "+cno+" "+u+" "+bill);
	}
}
class Main
{
	public static void main(String[] args)
	{
		Tariff a = new Tariff();
		a.input(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]), args[3], args[4]);
		a.bill = a.tariff();
		a.output();
	}
}
