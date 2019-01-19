import java.util.Scanner;
class Employee
{
  String name, des;
  int id, y, h;
  double bp, da, hra, lic, pf, gs, d, ns; void salary()
  {
      switch(des) {
        case "Intern":
          da = 2000;
          hra = 1000;
          gs = h * bp + da + hra;
          pf = 500;
          d = lic + pf;
          ns = gs - d;
          break;
        case "Manager":
          da = 0.4 * bp;
          hra = 0.1 * bp;
          pf = 0.08 * bp;
          d = lic + pf;
          gs = bp + da + hra;
          ns = gs - d;
          break;
        default:
          da = 0.3 * bp;
          hra = 0.1 * bp;
          gs = bp + da + hra;
          pf = 0.08 * pf;
          d = lic + pf;
          ns = gs - d;
          break;
      }
  }
  void promote()
  {
    if(y > 10) { 
      if(des.equals("Leader")) {
        des = "Manager";
        salary(); 
        System.out.println("\nPromoted!"); 
        print();
      }
    }
    else if(y > 8 && !(des.equals("Leader"))) {
      des = "Leader"; System.out.print("\nPromoted to "+des+"!");
    }
    else if(y > 1) {
      if(des.equals("Intern")) {
        des = "Trainee";
        bp = 10000;
        salary();
        System.out.println("\nPromoted to Trainee!\nBP: 10000"); 
        print();
      }
    }
  }
  void print()
  {
    System.out.print("Name: "+name+"\nID: "+id+"\nDesignation: "+des+"\nGross Salary: "+gs+"\nNet Salary: "+ns);
  }
  void input()
  {
    Scanner in = new Scanner(System.in); 
    System.out.print("Name: ");
    name = in.next(); 
    System.out.print("ID: ");
    id = in.nextInt(); 
    System.out.print("Designation: "); 
    des = in.next(); 
    if(des.equals("Intern")) {
           System.out.print("Hours: ");
           h = in.nextInt();
    }
    System.out.print("Experience years: ");
    y = in.nextInt();
    System.out.print("Basic Pay: ");
    bp = in.nextDouble(); 
    System.out.print("LIC (0 for opt-out): "); 
    lic = in.nextDouble();
  }
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in); 
    int n;
    System.out.print("No. of employees: "); 
    n = in.nextInt();
    Employee[] e = new Employee[n]; 
    for(int i = 0; i < n; i++) { 
      e[i] = new Employee();
      e[i].input(); 
      e[i].salary();
    }
    for(int i = 0; i < n; i++) {
      e[i].print();
      e[i].promote();
    }
  }
}
