import java.lang.*;
class Armstrong
{
      private int n;
      private int digits(int a)
      {
           int i = 0;
           while(a!=0) {
            i++; 
            a/=10;
           }
           return i; 
      }
      private boolean check(int a)
      {
           int d = a, s = 0; 
           while(d!=0) {
              s += java.lang.Math.pow(d%10,digits(a)); 
              d /= 10;
           }
           if(s==a) return true;
           else return false;
      }
      public static void main(String[] args) 
      {
           Armstrong ob = new Armstrong();
           if(ob.check(Integer.parseInt(args[0]))) System.out.print("Armstrong");
           else System.out.print("Not Armstrong");
      }
}
