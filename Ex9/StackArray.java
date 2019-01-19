public class StackArray<T> implements stack<T>
{
    T[] a;
    public StackArray(T[] b)
	{
    	a=b;
    }
    int top=-1;
    public int is_empty()
	{
    	if(top==-1)
	    return 0;
	else
	    return 1;
    }
    public int is_full(int size)
	{
    	if(top==size-1)
	    return 0;
    	else
	    return 1;
    }
    public void push(int size,T val)
	{
    	if(is_full(size)==0)
	    System.out.println("Stack is full");
		else
	    a[++top]=val;
    }
    public int pop()
	{
    	if(is_empty()==0){
	    System.out.println("Stack is empty");
	    return -1;
		}
    	else{
	    int x=top;
	    --top;
	    return x;
    	}
    }
}
