import java.util.Scanner;
abstract class Loan
{
    String name, username, password, address;
    int acc_num;
    void getUP()
    {
			Scanner in = new Scanner(System.in);
			name = in.next();
			username = in.next();
			password = in.next();
			address = in.next();
			acc_num = in.nextInt();
    }
    int login()
    {
			Scanner in = new Scanner(System.in);
			String u, p;
			u = in.next();
			p = in.next();
			if(username.equals(u)&&password.equals(p)) return 1;
			return 0;
    }
    abstract void sanctionLoan();
}
class EduLoan extends Loan
{
    int age; String q;
    void sanctionLoan()
    {
			Scanner in = new Scanner(System.in);
			age = in.nextInt();
			q = in.next();
			int loan;
			if(age>18 && q.equals("12")) loan = 1;
			else if(age>21 && q.equals("Arts")) loan = 2;
			else if(age>22 && q.equals("BE")) loan = 3;
			else loan = 0;
			if(loan!=0) System.out.println(loan+" lakhs");
			else System.out.println("Error");
    }
}
class HousingLoan extends Loan
{
    int income, amt;
    void sanctionLoan()
    {
			Scanner in = new Scanner(System.in);
			income = in.nextInt();
			amt = in.nextInt();
			double loan;
			if(income>500000) loan = amt*0.1;
			else if(income>1000000) loan = amt*0.3;
			else if(income>1500000) loan = amt*0.5;
			else loan = 0;
			if(loan!=0) System.out.println(loan);
			else System.out.println("Error");
    }
}
class LoanMain
{
    public static void main(String[] args)
    {
			Loan[] l = new Loan[100];
			int n;
			Scanner in = new Scanner(System.in);
			n = in.nextInt();
			for(int i = 0; i < n; i++) {
					int c = in.nextInt();
					if(c==1) l[i] = new EduLoan();
					else l[i] = new HousingLoan();
					l[i].getUP();
					l[i].login();
					l[i].sanctionLoan();
			}
    }
}
