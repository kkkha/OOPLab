import java.io.*;
import java.util.Scanner;
public class FileOperation
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("Enter choice\n1.Copy one file to another including text\n2.Delete a record in a File\n");
        ch = sc.nextInt();
        switch (ch)
        {
                case 1:
                    FileInputStream Fread = new FileInputStream("Hello.txt");
                    FileOutputStream Fwrite = new FileOutputStream("Hello1.txt");
                    System.out.println("File is Copied");
                    int c;
                    while ((c = Fread.read()) != -1)
                            Fwrite.write((char) c);
                    Fread.close();
                    Fwrite.close();
                    break;
                case 2:
                    PrintWriter pw = new PrintWriter("Hello1.txt");
                    BufferedReader br1 = new BufferedReader(new FileReader("Hello1.txt"));
                    String line1 = br1.readLine();
                    while (line1 != null) {
                        boolean flag = false;
                        BufferedReader br2 = new BufferedReader(new FileReader("Hello.txt"));
                        String line2 = br2.readLine();
                        while (line2 != null) {
                            if (line1.equals(line2)) {
                                flag = true;
                                break;
                            }
                            line2 = br2.readLine();
                        }
                        if (!flag)
                            pw.println(line1);
                        line1 = br1.readLine();
                    }
                pw.flush();
                br1.close();
                pw.close();
                System.out.println("File operation performed successfully");
                break;
                default:
                    System.out.println("Enter correct choice");
                    break;
        }
    }
}
