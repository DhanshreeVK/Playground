import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner s= new Scanner(System.in);
      String s1= s.nextLine();
      String s2= s.nextLine();
      int n= s.nextInt();
      s1=s1.replace(s1,s2);
      for(int i=0;i<s1.length();i++)
      {
        if(s1.charAt(i)!=32)
          System.out.print(s1.charAt(i));
        else
           System.out.print("\n");
          
      } 
    }
}