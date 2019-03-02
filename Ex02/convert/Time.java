package convert;
public class Time
{
    public static double htom(double d)
    {
	    return 60.0*d;
    }
        public static double htos(double d)
    {
	    return d*3600.0;
    }
        public static double mtoh(double d)
    {
	    return d/60.0;
    }
    public static double stoh(double d)
    {
	    return d/3600.0;
    }
}
