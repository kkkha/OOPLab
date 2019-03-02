import java.util.*;
class ArrayListString
{
    public static void main(String[] args)
    {
			ArrayList a = new ArrayList();
			Scanner in = new Scanner(System.in);
			System.out.println("1.Append 2.Insert 3.Search 4.Display");
			System.out.println("5.All string starts with letter 6.List all string contains substring");
			System.out.println("7.Sort 8.Delete 9.Replace 10.Remove duplicate elements 11.Stop");
			int ch=in.nextInt();
			while(1<=ch && ch<=10)
			{
				if(ch==1)
				{
				String q=in.next();
				a.add(q);
				}
				else if(ch==2)
				{
				int v=in.nextInt();
				String q=in.next();
				a.add(v,q);
				}
				else if(ch==3)
				{
				String q=in.next();
				if(a.indexOf(q)==-1)
					System.out.println("Absent");
				else
					System.out.println(a.indexOf(q));
				}
				else if(ch==4)
				{
				for(int i=0;i<a.size();i++)
					System.out.print(a.get(i)+" ");
				System.out.print("\n");
				}
				else if(ch==5)
				{
				char q=in.next().charAt(0);
				for(int i=0;i<a.size();i++)
				{
					String v=a.get(i).toString();
					if(v.charAt(0)==q)
					System.out.print(v+" ");
				}
				System.out.print("\n");
				}
				else if(ch==6)
				{
				String q=in.next();
				for(int i=0;i<a.size();i++)
				{
					String v=a.get(i).toString();
					if(v.contains(q))
					System.out.print(v+" ");
				}
				System.out.print("\n");
				}
				else if(ch==7)
				{
				Collections.sort(a);
				for(int i=0;i<a.size();i++)
					System.out.print(a.get(i)+" ");
				System.out.print("\n");
				}
				else if(ch==8)
				{
				String q=in.next();
				while(a.indexOf(q)!=-1)
				{
					int v=a.indexOf(q);
					a.remove(v);
				}
				}
				else if(ch==9)
				{
				String q=in.next();
				int v=in.nextInt();
				a.set(v,q);
				}
				else
				{
				for(int i=0;i<a.size();i++)
				{
					String q=a.get(i).toString();
					int v=a.indexOf(q),u=a.lastIndexOf(q);
					while(v!=u)
					{
					a.remove(u);
					u=a.lastIndexOf(q);
					}
				}
				}
				System.out.println("1.Append 2.Insert 3.Search 4.Display");
				System.out.println("5.All string starts with letter 6.List all string contains substring");
				System.out.println("7.Sort 8.Delete 9.Replace 10.Remove duplicate elements 11.Stop");
				ch=in.nextInt();
			}
    }
}
