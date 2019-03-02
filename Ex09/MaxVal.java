import java.util.Scanner;
class MaxVal
{
    public static void main(String[] args)
	{
			Generic g=new Generic();
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the data type 1.Integer 2.Double 3.String");
			int c=in.nextInt();
			System.out.println("Enter the length");
			int n=in.nextInt();
			if(c==1){
				Integer[] a=new Integer[n];
				System.out.println("Enter the inputs");
				for(int i=0;i<n;i++)
				a[i]=in.nextInt();
				int r=g.<Integer>max(a);
				System.out.println("Max: "+r);
			}
			else if(c==2){
				Double[] b=new Double[n];
				System.out.println("Enter the inputs");
				for(int i=0;i<n;i++)
				b[i]=in.nextDouble();
				double z=g.<Double>max(b);
				System.out.println("Max: "+z);
			}
			else{
				String[] s=new String[n];
				System.out.println("Enter the inputs");
				for(int i=0;i<n;i++)
				s[i]=in.next();
				String z=g.<String>max(s);
				System.out.println("Max: "+z);
			}
    }   
}
