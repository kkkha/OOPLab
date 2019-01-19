import java.util.Scanner;
class Student
{
    int roll;
    int[] m = new int[3]; 
    double avg;
    String grade, name, dept;
    public String gradecalc()
    {
	    if(avg>=91) return "A";
	    else if(avg>=81) return "B";
	    else if(avg>=71) return "C";
	    else if(avg>=61) return "D";
	    else return "E";
    }
    public void input()
    {	 
	    Scanner in = new Scanner(System.in);
	    avg = 0;
	    name = in.next();
	    dept = in.next();
	    roll = in.nextInt();
	    for(int i = 0; i < 3; i++) {
	      m[i] = in.nextInt();
	      avg += m[i];
	    }
	    avg/=3.0;
	    grade = gradecalc();
    }
    public void print()
    {	
	    System.out.println(name+" "+dept+" "+roll+" "+m[0]+" "+m[1]+" "+m[2]+" "+avg+" "+grade);
    }
    public void search(int r)
    {
	    if(roll==r) print();
    }
    public void search(String d)
    {
	    if(dept.equals(d)) print();
    }
}
class Main
{
    public static void main(String[] args)
    {
	    Student[] s = new Student[5];
	    int i = 0;
	    for(i = 0; i < 5; i++) {
	        s[i] = new Student();
	        s[i].input();
	    }
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    for(i = 0; i < 5; i++) s[i].search(n);
	    String d = in.next();
	    for(i = 0; i < 5; i++) s[i].search(d);
    }
}
