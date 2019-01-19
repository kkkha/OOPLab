class SumofNaturals
{
  private static int n;
  private static int sum(int a)
  {
    int s = 1;
    for(int i = 2; i <= a; i++) 
      s+=i; 
    return s;
  }
  public static void main(String[] args) 
  {
    n = Integer.parseInt(args[0]); 
    System.out.println(sum(n));
  }
}
