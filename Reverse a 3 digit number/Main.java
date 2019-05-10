import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code 
    Scanner s= new Scanner(System.in);
    int n= s.nextInt();
    //for(int i=1;i<=3;i++)
    while(n!=0)
    {
      int n1=n%10;
      System.out.print(n1);
      n=n/10;
      
    }
    
  }
}