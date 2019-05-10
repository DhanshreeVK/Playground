import java.util.Scanner;
class Main
{
  public static void pow(int n,int m)
  {
  int p=1;
    for(int i=1;i<=m;i++)
    {
      p=p*n;
     }
    System.out.println(p);
  }
  public static void main(String args[])
  {
    Scanner s= new Scanner(System.in);
    int n= s.nextInt();
    int m=s.nextInt();
   pow(n,m);
    
  }
}