import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main 

{

   public static void main(String[] args) 
   {

        Scanner sc = new Scanner(System.in);
        String pString = sc.nextLine();
        String t = sc.nextLine();
        Pattern p = Pattern.compile(pString);
        Matcher m = p.matcher(t);

        int c = 0;
        while(m.find()) {
            c++;
           System.out.println("found: " + c + " : "+ m.start() + " - " + m.end());
           }
           if(c == 0)
           System.out.println("The given word is not present in the string");
           else
           System.out.println(c);
    }
}