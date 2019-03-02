class Factorial
{
  private static int n;
  private static int factorial(int a) 
  {
    if(a==0) return 1;
    else if(a==1) return 1;
    else return a*factorial(a-1);
  }
  public static void main(String[] args) 
  {
    System.out.print(factorial(Integer.parseInt(args[0])));
  }
}  
