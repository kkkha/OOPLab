public class Student
{
      private int m1, m2, m3, roll;
      double avg;
      String grade, name;
      public String gradecalc()
      {
        double a = (m1+m2+m3)/3.0;
        if(a>=91) return "A";
        else if(a>=81) return "B";
        else if(a>=71) return "C";
        else if(a>=61) return "D";
        else return "E";
      }
      public void input(int ma1, int ma2, int ma3, int sroll, String sname)
      {
        m1 = ma1; 
        m2 = ma2; 
        m3 = ma3; 
        roll = sroll; 
        name = sname;
      }
      public void output()
      {
        System.out.println(name+" "+roll+" "+m1+" "+m2+" "+m3+" "+grade); 
      }
}
class Main
{
      public static void main(String[] args) 
      {
        Student s = new Student();
        s.input(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]),Integer.parseInt(args[3]),args[4]);
        s.grade=s.gradecalc(); 
        s.output();
      }
}
