class OddEven
{
  private static int a;
  private static void oddeven(int x)
  {
    if(x%2==0) System.out.print("Even\n"); 
    else System.out.print("Odd\n");
  }
  public static void main(String[] args) 
  {
    a = Integer.parseInt(args[0]); 
    oddeven(a);
  }
}
