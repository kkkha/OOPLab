import java.util.*;
class Person
{
    int age;
    String name, aadhaar;
    void getInput()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Age Name Aadhaar: ");
        try {
            age = Integer.parseInt(in.next());
        }
        catch(NumberFormatException e) {
            System.out.println("Age error, NumberFormatException!");
        }
        name = in.next();
        aadhaar = in.next();
    }
    void display()
    {
        System.out.println("Name: "+name+"\nAge: "+age+"\nAadhaar: "+aadhaar);
    }
    String canVote() throws MinorCitizenException
    {
        if(age >= 18) return "Can Vote!";
        else throw new MinorCitizenException("Too young to vote!");
    }
    String hasAadhaar()
    {
        try {
            if(aadhaar.equals("0")) throw new NullPointerException();
            else return "Has Aadhaar!";
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointerException: No valid Aadhaar!");
        }
        return "";
    }
}
class MinorCitizenException extends Exception
{
    String msg;
    MinorCitizenException(String m)
    {
        super(m);
        msg = m;
    }
    public String toString()
    {
        return ("MinorCitizenException: "+msg);
    }
}
class PersonMain
{
    public static void main(String[] args)
    {
        Person p = new Person();
        p.getInput();
        p.display();
        try {
            System.out.println(p.canVote());
        }
        catch(MinorCitizenException e)
        {
            System.out.println(e);
        }
        System.out.println(p.hasAadhaar());
    }
}
