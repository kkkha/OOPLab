import java.util.Scanner;
class Employee
{
    String name, address, mail;
    int id, mobile;
    void calc(double b)
    {
      double da, hra, pf, bp, gs, ns;
      da = 0.97*b;
      hra = 0.1*b;
      gs = da + hra;
      pf = 0.12*b;
      bp = 0.001*b;
      ns = gs - pf - bp;
      System.out.println("Gross: "+gs);
      System.out.println("Net: "+ns);
    }
}
class Programmer extends Employee
{
    double b;
    void assign()
    {
      Scanner in = new Scanner(System.in);
      b = in.nextDouble();
    }
    void calc()
    {
      assign();
      super.calc(b);
    }
}
class AP extends Employee
{
    double b;
    void assign()
    {
      Scanner in = new Scanner(System.in);
      b = in.nextDouble();
    }
    void calc()
    {
      assign();
      super.calc(b);
    }
}
class AssoP extends Employee
{
    double b;
    void assign()
    {
      Scanner in = new Scanner(System.in);
      b = in.nextDouble();
    }
    void calc()
    {
      assign();
      super.calc(b);
    }
}
class P extends Employee
{
    double b;
    void assign()
    {
      Scanner in = new Scanner(System.in);
      b = in.nextDouble();
    }
    void calc()
    {
      assign();
      super.calc(b);
    }
}
class Employees
{
    public static void main(String[] args)
    {
      String role;
      Scanner in = new Scanner(System.in);
      role = in.next();
      if(role.equals("Programmer")) {
        Programmer o = new Programmer();
        o.calc();
      }
      else if(role.equals("AP")) {
          AP o = new AP();
          o.calc();
      }
      else if(role.equals("AssoP")) {
        AssoP o = new AssoP();
        o.calc();
      }
      if(role.equals("P")) {
        P o = new P();
        o.calc();
      }
    }
}
    
    
