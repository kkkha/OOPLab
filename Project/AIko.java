import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.io.IOException;
import java.lang.Math;
import java.util.Random;
class Tokenizer
{
    ArrayList<String> tokens = new ArrayList<String>();
    Tokenizer(String in)
    {
        String regExp = "[,?!\\s]+";
        String[] words = in.split(regExp);
        for(int i = 0; i < words.length; i++)
        {
            tokens.add(words[i]);
        }
    }
    String getString()
    {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    void displayTokens()
    {
        for(int i = 0; i < (this.tokens).size(); i++)
            System.out.println((this.tokens).get(i));
    }
}
class Intents
{
    static String userName = "", fileOpen = "";
    static int flag = 0;
    static String operate(Tokenizer tok)
    {
        String out = "";
        if(flag == 0)
        {
            out = "Hi, "+userName+"!";
            flag = 1;
        }
        else if((tok.tokens).contains("Hello") || (tok.tokens).contains("hello") || (tok.tokens).contains("Hi") || (tok.tokens).contains("hi"))
        {
            if((tok.tokens).contains("how") || (tok.tokens).contains("How"))
            {
                out = getHelloHow();
            }
            else out = getHello();
        }
        else if((tok.tokens).contains("how") || (tok.tokens).contains("How"))
        {
            out = getHow();
        }
        else if((tok.tokens).contains("+") || (tok.tokens).contains("-") || (tok.tokens).contains("*") || (tok.tokens).contains("/") || (tok.tokens).contains("pow"))
        {
            out = getMath((tok.tokens).get(0), (tok.tokens).get(1), (tok.tokens).get(2));
        }
        else if((tok.tokens).contains("Time") || (tok.tokens).contains("time") || (tok.tokens).contains("Date") || (tok.tokens).contains("date"))
        {
            Date d = new Date();
            out = String.valueOf(d);
        }
        else if((tok.tokens).contains("name") || (tok.tokens).contains("Name"))
        {
            if((tok.tokens).contains("Your") || (tok.tokens).contains("your")) out = "AIko desu!";
            else
            {
                out = getMyName();
            }
        }
        else if((tok.tokens).contains("open") || (tok.tokens).contains("Open"))
        {
            if((tok.tokens).contains("file") || (tok.tokens).contains("File"))
            {
                out = "Hold On...";
                JFileChooser j = new JFileChooser();
                int r = j.showOpenDialog(null);
                if(r == JFileChooser.APPROVE_OPTION) {
                    fileOpen = j.getSelectedFile().getAbsolutePath();
                    Desktop d = Desktop.getDesktop();
                    File file = new File(fileOpen);
                    try {
                        if(file.exists()) d.open(file);
                    }
                    catch(IOException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }
        else if((tok.tokens).contains("Weather") || (tok.tokens).contains("weather"))
        {
            out = "Weather...";
            getWeather();
        }
        else out = getUnknown();
        return out;
    }
    static String getHello()
    {
        String[] response = {"Konnichiwa!", "Hi!", "AIko says hello!", "Hello there!", "Yo!" };
        Random rand = new Random();
        int i = rand.nextInt(5);
        return response[i];
    }
    static String getHelloHow()
    {
        String[] response = {"Hi! I'm fine.", "Hello, I'm doing good.", "Konnichiwa! Ii desu yo." };
        Random rand = new Random();
        int i = rand.nextInt(3);
        return response[i];
    }
    static String getHow()
    {
        String[] response = {"I'm fine!", "Daijobu desu.", "I'm feeling great!", "I'm happy!", "Ureshii!" };
        Random rand = new Random();
        int i = rand.nextInt(5);
        return response[i];
    }
    static String getMath(String a, String o, String b)
    {
        double ad = Double.parseDouble(a);
        double bd = Double.parseDouble(b);
        double ans = 0;
        if(o.equals("+"))
        {
            ans = ad + bd;
        }
        if(o.equals("-"))
        {
            ans = ad - bd;
        }
        if(o.equals("*"))
        {
            ans = ad * bd;
        }
        if(o.equals("/"))
        {
            ans = ad / bd;
        }
        if(o.equals("pow"))
        {
            ans = Math.pow(ad, bd);
        }
        return String.valueOf(ans);
    }
    static String getUnknown()
    {
        String[] response = {"Wakaranai!", "Nani?!", "I don't understand."};
        Random rand = new Random();
        int i = rand.nextInt(3);
        return response[i];
    }
    static String getMyName()
    {
        return userName;
    }
    static void getWeather()
    {
        Runtime rt = Runtime.getRuntime();
        String url = "https://www.google.co.in/search?q=weather";
        try {
            rt.exec("open " + url);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
class UserInterface extends JFrame
{
    String text;
    UserInterface()
    {
        JFrame UI = new JFrame("AIko");
        UI.setSize(800,400);
        UI.setLayout(new GridLayout(2, 1));
        UI.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        JButton ask = new JButton("Ask");
        JTextArea textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setEditable(false);
        JTextField t = new JTextField(16);
        textArea.append("Hello, I'm AIko!\nWhat is your name?\n");
        ask.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                text = t.getText();
                t.setText("");
                if(Intents.flag==0) Intents.userName = text;
                Tokenizer tok = new Tokenizer(text);
                String output = Intents.operate(tok);
                textArea.append(output + "\n");
            }
        });
        ImageIcon icon = new ImageIcon("aiko.png");
        JLabel labelicon = new JLabel(icon);
        UI.add(labelicon);
        UI.add(scrollPane);
        UI.add(t);
        UI.add(ask);
        UI.setVisible(true);
    }
}
class AIko
{
    public static void main(String[] args)
    {
        new UserInterface();
    }
}
