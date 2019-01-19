import java.lang.Character;
import java.util.Scanner;
class PANRequiredException extends Exception
{
    String msg;
    PANRequiredException(String m)
    {
		super(m);
		msg=m;
    }
    public String toString()
    {
		return msg;
    }
}
class MinBalRequiredException extends Exception
{
    String msg;
    MinBalRequiredException(String m)
    {
		super(m);
		msg=m;
    }
    public String toString()
    {
		return msg;
    }
}
class NotEnoughMoneyInAccountException extends Exception
{
    String msg;
    NotEnoughMoneyInAccountException(String m)
    {
		super(m);
		msg=m;
    }
    public String toString()
    {
		return msg;
    }
}
class AccountNotFoundException extends Exception
{
    String msg;
    public AccountNotFoundException(String m)
    {
		super(m);
		msg=m;
    }
    public String toString()
    {
		return msg;
    }
}
class PANFormatMismatchException extends Exception
{
    String msg;
    PANFormatMismatchException(String m)
    {
		super(m);
		msg=m;
    }
    public String toString()
    {
		return msg;
    }
}
class BranchNotFoundException extends Exception
{
    String msg;
    BranchNotFoundException(String m)
    {
		super(m);
		msg=m;
    }
    public String toString()
    {
		return msg;
    }
}
class Accounteg
{
    String name,branch,acct_num;
    double balance;
    Scanner in=new Scanner(System.in);
    String PAN_num=null;
    int getinput()
    {
		System.out.println("Enter account no., name, branch, balance");
		acct_num=in.next();
		name=in.next();
		branch=in.next();
		balance=in.nextDouble();
		try
		{
			if(!(branch.equals("Chennai")))
			throw new BranchNotFoundException("Branch is not found");
			return 1;
		}
		catch(BranchNotFoundException e)
		{
			System.out.println(e);
			return 0;
		}
    }
    int deposit()
    {
		System.out.println("Enter the amount to be deposited");
		double d=in.nextDouble();
		try
		{
			if(d>25000.0)
			throw new PANRequiredException("PAN no. is required");
			else
			balance+=d;
			return 1;
		}
		catch(PANRequiredException e)
		{
			System.out.println(e);
		}
		try
		{
			PAN_num=in.next();
			if(PAN_num.length()!=10)
			throw new PANFormatMismatchException("Incorrect PAN format");
			int f=1;
			for(int i=0;i<10;i++)
			{
			char c=PAN_num.charAt(i);
			if(i<5 || i==9)
			{
				if(!(Character.isLetter(c)))
				{
				f=0;
				break;
				}
			}
			else if(i<9)
			{
				if(!(Character.isDigit(c)))
				{
				f=0;
				break;
				}
			}
			if(f==0)
				throw new PANFormatMismatchException("Incorrect PAN format");
			}
			balance+=d;
			return 1;
		}
		catch(PANFormatMismatchException e)
		{
			System.out.println(e);
			return 0;
		}
    }
    int withdrawal()
    {
		System.out.println("Enter the amount to be withdrawn");
		double w=in.nextDouble();
		try
		{
			if(w>balance)
			throw new NotEnoughMoneyInAccountException("Insufficient balance");
			else if(balance-w<2000.0)
			throw new MinBalRequiredException("A lesser amount has to be chosen");
			balance-=w;
			return 1;
		}
		catch(NotEnoughMoneyInAccountException e)
		{
			System.out.println(e);
			return 0;
		}
		catch(MinBalRequiredException e)
		{
			System.out.println(e);
			return 0;
		}
    }
    void print()
    {
		System.out.println("Account no.:"+acct_num+"\nName:"+name+"\nBranch:"+branch);
		System.out.println("Balance:"+balance);
		if(PAN_num!=null)
			System.out.println("PAN no.:"+PAN_num);
    }
   void search()
    {
		try
		{
			System.out.println("Enter account no. to be searched");
			String a=in.next();
			if(!(a.equals(acct_num)))
			throw new AccountNotFoundException("Not found");
			System.out.println("Found");
		}
		catch(AccountNotFoundException e)
		{
			System.out.println(e);
		}
    }
}
class Account
{
    public static void main(String[] args)
    {
		Scanner in = new Scanner(System.in);
		Accounteg[] a=new Accounteg[3];
		for(int i=0;i<3;i++)
		{
			a[i]=new Accounteg();
			int v=a[i].getinput();
			if(v!=1)
			break;
			else
			{
			System.out.println("1.Deposit 2.Withdraw 3.Exit");
			v=in.nextInt();
			if(v==3)
				continue;
			else if(v==2)
			{
				v=a[i].withdrawal();
				if(v==0)
				break;
			}
			else
			{
				v=a[i].deposit();
				if(v==0)
				break;
			}
			a[i].search();
			}
			a[i].print();
		}
    }
}
