import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner s= new Scanner(System.in);
      int n=s.nextInt();
      switch(n)
      {
        case 1:
          int side= s.nextInt();
          System.out.print(side*side);
          break;
           case 2:
          int l=s.nextInt();
          int b=s.nextInt();
          System.out.print(l*b);
          break;
           case 3:
          int bs=s.nextInt();
          int h=s.nextInt();
          System.out.print(0.5*bs*h);
          break;
           case 4:
          int rd=s.nextInt();
          System.out.print(3.14*rd*rd);
          break;
      }
    }
}