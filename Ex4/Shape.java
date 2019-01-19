import java.util.Scanner;
abstract class Shape
{
    int a;
    int b;
    abstract void printArea();
}
class Rectangle extends Shape
{
    void printArea()
    {
			Scanner in = new Scanner(System.in);
			a = in.nextInt();
			b = in.nextInt();
			System.out.println("Area of rectangle = "+(a*b));
    }
}
class Triangle extends Shape
{
    void printArea()
    {
			Scanner in = new Scanner(System.in);
			a = in.nextInt();
			b = in.nextInt();
			System.out.println("Area of triangle = "+(a*b*0.5));
    }
}
class Circle extends Shape
{
    void printArea()
    {
			Scanner in = new Scanner(System.in);
			a = in.nextInt();
			System.out.println("Area of circle = "+(a*a*3.14));
    }
}
class Main
{
    public static void main(String[] args)
    {
			Rectangle r = new Rectangle();
			Triangle t = new Triangle();
			Circle c = new Circle();
			r.printArea();
			t.printArea();
			c.printArea();
    }
}
