import java.util.Scanner;
class Matrix
{
    boolean checksize(int m, int n, int p, int q, char t)
    {
	    if(t=='a') {
	      if(m==p&&n==q) return true;
	      else return false;
	    }
	    else if(t=='m') {
	      if(n==p) return true;
	      else return false;
	    }
	    return false;
    }
    void add(int[][] a, int[][] b, int[][] c)
    {
	    int m = a.length;
	    int n = a[0].length;
	    for(int i = 0; i < m; i++)
	        for(int j = 0; j < n; j++)
		        c[i][j] = a[i][j] + b[i][j];
    }
    void sub(int[][] a, int[][] b, int[][] c)
    {
	    int m = a.length;
	    int n = a[0].length;
	    for(int i = 0; i < m; i++)
	       for(int j = 0; j < n; j++)
		        c[i][j] = a[i][j] - b[i][j];
    }
    void mult(int[][] a, int[][] b, int[][] c)
    {
	    int m = a.length;
	    int n = b.length;
	    int q = b[0].length;
	    for(int i = 0; i < m; i++)
	        for(int j = 0; j < q; j++) {
		        c[i][j] = 0;
		        for(int k = 0; k < n; k++)
		          c[i][j] += a[i][k] * b[k][j];
	        }
    }
    void print(int[][] a)
    {
	    for(int i = 0; i < a.length; i++) {
	       for(int j = 0; j < a[0].length; j++)
		        System.out.print(a[i][j]+" ");
	       System.out.print("\n");
	    }
    }
}
class Main
{
    public static void main(String[] args)
    {
	    int m, n, p, q;
	    Scanner in = new Scanner(System.in);
	    Matrix o = new Matrix();
	    m = in.nextInt();
	    n = in.nextInt();
	    int[][] a = new int[m][n];
	    for(int i = 0; i < m; i++)
	       for(int j = 0; j < n; j++)
		        a[i][j] = in.nextInt();
	    p = in.nextInt();
	    q = in.nextInt();
	    int[][] b = new int[p][q];
	    for(int i = 0; i < p; i++)
	       for(int j = 0; j < q; j++)
		        b[i][j] = in.nextInt();
	    if(o.checksize(a.length,a[0].length,b.length,b[0].length, 'a')) {
	      int[][] r = new int[m][n];
	      o.add(a,b,r);
	      o.print(r);
	      o.sub(a,b,r);
	      o.print(r);
	    }
	    else System.out.println("Not possible to +/-");
	    if(o.checksize(a.length,a[0].length,b.length,b[0].length, 'm')) {
	        int[][] r = new int[m][q];
	        o.mult(a,b,r);
	        o.print(r);
	    }
	    else System.out.println("Not possible to multiply");
    }
}
	
