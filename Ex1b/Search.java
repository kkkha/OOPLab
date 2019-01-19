import java.util.Scanner;
class Search
{
    static void sort(int[] a, int n)
    {
	    int t;
	    for(int i = 0; i < n-1; i++)
	      for(int j = 0; j < n-1; j++)
		      if(a[j]>a[j+1]) {
		        t = a[j];
		        a[j] = a[j+1];
		        a[j+1] = t;
		      }
    }
    static int linears(int[] a, int n, int t)
    {
	    for(int i = 0; i < n; i++)
	      if(a[i]==t) return i;
	    return -1;
    }
    static int binarys(int[] a, int n, int t)
    {
	    int l = 0, u = n - 1;
	    int mid = (l+u)/2;
	    while(l<=u) {
	      mid = (l+u)/2;
	      if(a[mid]==t) return mid;
	      else if(a[mid]<t) l = mid + 1;
	      else u = mid - 1;
	    }
	    return -1;
    }
    public static void main(String[] args)
    {
	    Scanner in = new Scanner(System.in);
	    int[] a = new int[10];
	    int t, s;
	    for(int i = 0; i < 10; i++)
	      a[i] = in.nextInt();
	    t = in.nextInt();
	    s = linears(a, 10, t);
	    switch(s) {
	      case -1: System.out.println("Not found"); break;
	      default: System.out.println("Found: "+s); break;
 	    }
	    sort(a, 10);
	    s = binarys(a, 10, t);
	    switch(s) {
	      case -1: System.out.println("Not found"); break;
	      default: System.out.println("Found"); break;
	    }
    }
}
