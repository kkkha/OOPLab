import java.util.Scanner;
class Stack
{
    int[] a = new int[10];
    int top = -1;
    void push(int p)
    {
      try {
        a[++top] = p;
      }
      catch(Exception e) {
        System.out.println("Overflow");
        top--;
      }
    }
    int pop()
    {
      int p;
      try {
        p = a[top];
        top--;
        return p;
      }
      catch(Exception e) {
        System.out.println("Underflow");
        top++;
      }
      return -1;
    }
}
class Stacks
{
    static Stack s = new Stack();
    public static void main(String[] args)
    {
			int c = 1; Scanner in = new Scanner(System.in);
			while(c!=0) {
					System.out.print("1. Push 2. Pop 0. Quit\n");
					c = in.nextInt();
					if(c==1) {
						int a = in.nextInt();
						s.push(a);
					}
					else if(c==2) {
						System.out.println(s.pop());
					}
			}
    }
}
