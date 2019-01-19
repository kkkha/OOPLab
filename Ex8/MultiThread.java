import java.util.*;
class Thread2 implements Runnable
{
    int i;
    Thread2(int j)
    {
		i=j;
    }
    public void run()
    {
		System.out.println("Square: "+i*i);
		System.out.println("waiting...");
    }
}
class Thread3 implements Runnable
{
    int i;
    Thread3(int j)
    {
		i=j;
    }
    public void run()
    {
		System.out.println("Cube: "+i*i*i);
		System.out.println("waiting...");
    }
}
class Thread1 implements Runnable
{
    int q;
    Random rand=new Random();
    public void run()
    {
		int i=0;
		while(i<10)
		{
			q=rand.nextInt(50);
			System.out.print("Number: "+q+" ");
			if(q%2==0)
			{
			Thread t2=new Thread(new Thread2(q));
			t2.start();
			}
			else
			{
			Thread t3=new Thread(new Thread3(q));
			t3.start();
			}
			i++;
			try
			{
			Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
			System.out.println("Main thread interrupted");
			}
		}
    }
}
class MultiThread
{
    public static void main(String[] args)
    {
		Thread t1=new Thread(new Thread1());
		t1.start();
    }
}
