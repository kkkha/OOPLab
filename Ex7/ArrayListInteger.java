import java.util.ArrayList;
import java.util.Scanner;
class ArrayListInteger
{
    public static void main(String[] args)
    {
			ArrayList<Integer> l1= new ArrayList<Integer>();
			ArrayList<Integer> l2= new ArrayList<Integer>();
			int n1,n2;
			Scanner in= new Scanner(System.in);
			System.out.println("Enter size of first list");
			n1=in.nextInt();
			System.out.println("Enter the elements: "); 
			for(int i=0;i<n1;i++){
				int a=in.nextInt();
				l1.add(a);
			}
			System.out.println("Enter size of second list");
			n2=in.nextInt();
			System.out.println("Enter the elements: ");
			for(int i=0;i<n2;i++){
				int a=in.nextInt();
				l2.add(a);
			}
			ArrayList<Integer> u=new ArrayList<Integer>();
			for(int i=0;i<n1;i++)
				if(!u.contains(l1.get(i)))
				u.add(l1.get(i));
			for(int i=0;i<n2;i++){
				if(!u.contains(l2.get(i)))
				u.add(l2.get(i));
			}
			System.out.println("Union: "+u);
			ArrayList<Integer> m=new ArrayList<Integer>();
			for(int i=0;i<n1;i++)
				m.add(l1.get(i));
			for(int i=0;i<n2;i++)
				m.add(l2.get(i));
			System.out.println("Merge: "+m);
			ArrayList<Integer> I=new ArrayList<Integer>();
			for(int i=0;i<n2;i++){
				if(l1.contains(l2.get(i)))
				I.add(l2.get(i));
			}
			System.out.println("Intersection: "+I);
			int flag=0;
			if(n1==n2){
				for(int i=0;i<n2;i++){
				if(l1.get(i)>l2.get(i)){
					flag=1;
				}
				else if(l1.get(i)<l2.get(i)){
					flag=2;
				}   
				}
			}
			else if(n1>n2)
				flag=1;
			else
				flag=2;
			if(flag==0){
				System.out.println("Both are Equal");
			}
			else if(flag==1){
				System.out.println("List1 is greater" );
			}
			else
				System.out.println("List2 is greater");
	}
}
