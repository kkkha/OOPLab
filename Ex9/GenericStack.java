import java.util.Scanner;
class GenericStack
{
    public static void main(String[] args)
	{
			int o1,o2;
			Scanner in=new Scanner(System.in);
			String val;
			int size=10;
			System.out.println("Enter the data type 1.Integer 2.String");
			o1=in.nextInt();
			StackArray s;
			if(o1==1) {
				Integer[] qi=new Integer[size]; 
				s=new StackArray(qi);
			}
			else {
				String[] qs=new String[size]; 
				s=new StackArray(qs);
			}
			char ch;
			do{
			System.out.println("1.Push 2.Pop 3.Display");
			System.out.println("Enter option:");
			o2=in.nextInt();
			switch(o2){
			case 1:
			val=in.next();
			try{
				if(o1==1)
				s.push(size,Integer.parseInt(val));
				else
				s.push(size,val);
			}
			catch(NumberFormatException e){
				System.out.println("Only integers can be pushed");
				break;
			}	
			break;
			case 2:
			if(o1==1){
				int x=s.pop();
				if(x==-1)
				System.out.println("No elements to be popped");
				else
				System.out.println("Popped element:"+s.a[x]);
			}
			else{
				int x=s.pop();
				if(x==-1)
				System.out.println("No elements to be popped");
				else	
				System.out.println("Popped element:"+s.a[x]);
			}
			break;
			case 3:
			if(o1==1)
				System.out.println(s.a[s.top]);
			else
				System.out.println(s.a[s.top]);
			break;
			default:
			System.out.println("Invalid choice:");
			}
			System.out.println("Do you want to continue?y/n");
			ch=in.next().charAt(0);
			}while(ch=='y');
    }
}
