import convert.*;
import java.util.Scanner;
class Convert
{
    public static void currency()
    {
			System.out.println("1. $ to ₹\n2. ₹ to $\n3. € to ₹\n4. ₹ to €\n5. 円 to ₹\n6. ₹ to 円");
			int c;
			double d;
			Scanner in = new Scanner(System.in);
			c = in.nextInt();
			switch(c) {
			case 1: d = in.nextDouble();System.out.println(Currency.dtoi(d)); break;
			case 2: d = in.nextDouble();System.out.println(Currency.itod(d)); break;
			case 3: d = in.nextDouble();System.out.println(Currency.etoi(d)); break;
			case 4: d = in.nextDouble();System.out.println(Currency.itoe(d)); break;
			case 5: d = in.nextDouble();System.out.println(Currency.ytoi(d)); break;
			case 6: d = in.nextDouble();System.out.println(Currency.itoy(d)); break;
			default: System.out.println("Invalid");
			}
    }
    public static void distance()
    {
			System.out.println("1. mi to km\n2. km to mi\n3. m to km\n4. km to m");
			int c;
			double d;
			Scanner in = new Scanner(System.in);
			c = in.nextInt();
			switch(c) {
			case 1: d = in.nextDouble();System.out.println(Distance.mitokm(d)); break;
			case 2: d = in.nextDouble();System.out.println(Distance.kmtomi(d)); break;
			case 3: d = in.nextDouble();System.out.println(Distance.mtokm(d)); break;
			case 4: d = in.nextDouble();System.out.println(Distance.kmtom(d)); break;
			default: System.out.println("Invalid"); 
			}
    }
    public static void time()
    {
			System.out.println("1. h to m\n2. h to s\n3. m to h\n4. s to h\n5. hm to m");
			int c, h, m;
			double d;
			Scanner in = new Scanner(System.in);
			c = in.nextInt();
			switch(c) {
			case 1: d = in.nextDouble();System.out.println(Time.htom(d)); break;
			case 2: d = in.nextDouble();System.out.println(Time.htos(d)); break;
			case 3: d = in.nextDouble();System.out.println(Time.mtoh(d)); break;
			case 4: d = in.nextDouble();System.out.println(Time.stoh(d)); break;
			case 5: d = h=in.nextInt();m=in.nextInt();System.out.println((int)Time.htom(h)+m); break;
			default: System.out.println("Invalid");
			}
    }
    public static void main(String[] args)
    {
			Scanner in = new Scanner(System.in);
			int c;
			do{
				System.out.println("Convert: 1. Currency 2. Distance 3. Time 4. Quit");
				c = in.nextInt();
				switch(c) {
				case 1: currency(); break;
				case 2: distance(); break;
				case 3: time(); break;
				}
			}while(c!=4);
    }
}
