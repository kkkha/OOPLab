class Generic
{
    public<T extends Comparable<T>> T max(T[] a)
	{
			T b=a[0];
			for(int i=1;i<a.length;i++) {
				if(a[i].compareTo(b)>0)
				b=a[i];
			}
			return b;
    }
}