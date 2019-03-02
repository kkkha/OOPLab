import java.util.Scanner;
class Box
{
    int l, w, d;
    void assign(int l, int w, int d)
    {
        this.l = l;
        this.w = w;
        this.d = d;
    }
}
class BoxWeight extends Box
{
    int wt;
    void assignwt(int w)
    {
	    wt = w;
    }
}
class BoxShipment extends BoxWeight
{
    int cost;
    void calc()
    {
        int v = l * w * d;
        cost = wt*50 + v*2;
    }
    void print()
    {
	    System.out.println("Cost: "+cost);
    }
}
class BoxMain
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        BoxShipment b = new BoxShipment();
        int l, w, d, wt;
        l = in.nextInt();
        w = in.nextInt();
        d = in.nextInt();
        wt = in.nextInt();
        b.assign(l,w,d);
        b.assignwt(wt);
        b.calc();
        b.print();
    }
}
