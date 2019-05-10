import java.util.Scanner;
class Main
{
  public static int sqr(int n)
  {
    int square= n*n;
    return square;
  }
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner s= new Scanner(System.in);
      int n= s.nextInt();
      System.out.println(sqr(n));
      
	} 
}