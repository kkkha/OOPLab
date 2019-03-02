import java.util.Scanner;
class Person
{
    String name, dob, address;
    void input()
    {
      Scanner in = new Scanner(System.in);
      name = in.next();
      dob = in.next();
      address = in.next();
    }
    void print()
    {
		  System.out.println(name+" "+dob+" "+address);
    }
    void calcperformance()
    {
    }
}
class Student extends Person
{
    String d;
    int m, e;
    void calcperformance()
    {
      if(m>=90&&e>=90) System.out.println("Outstanding");
      else if(m>=75&&e>=60) System.out.println("Excellent");
      else if(m>=60&&e>=30) System.out.println("Good");
      else System.out.println("Fair");
    }
    void input()
    {
      Scanner in = new Scanner(System.in);
      super.input();
      d = in.next();
      m = in.nextInt();
      e = in.nextInt();
    }
    void print()
    {
      super.print();
      System.out.println(d+" "+m+" "+e);
    }
}
class Prof extends Person
{
    String d;
    int p, i;
    void calcperformance()
    {
      if(p+i>=20) System.out.println("Outstanding");
      else if(p+i>=10) System.out.println("Excellent");
      else if(p+i>=5) System.out.println("Good");
      else System.out.println("Fair");
    }
    void input()
    {
      Scanner in = new Scanner(System.in);
      super.input();
      d = in.next();
      p = in.nextInt();
      i = in.nextInt();
    }
    void print()
    {
      super.print();
      System.out.println(d+" "+p+" "+i);
    }
}
class Record
{
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n; String c;
      n = in.nextInt();
      Person p[] = new Person[n];
      for(int i = 0; i < n; i++) {
        c = in.next();
        if(c.equals("Student")) p[i] = new Student();
        else p[i] = new Prof();
        p[i].input();
        p[i].print();
        p[i].calcperformance();
      }
    }
}
