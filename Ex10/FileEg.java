import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;
public class FileEg 
{
    public static void main(String[] a)
    {
        System.out.println("Enter the file name:");
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        File fin = new File(s);
        if(fin.exists()) {
            System.out.println("Exists");
            if(fin.canRead())System.out.println("Readable");
            else System.out.println("Cannot read");
            if(fin.canWrite())System.out.println("Can write");
            else System.out.println("Cannot write");
            System.out.println(fin.length());
        }
        else
            System.out.println("Doesn't exist");
    }
}
