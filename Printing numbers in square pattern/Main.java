import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s= new Scanner(System.in);
      int n=s.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n;j++)
        {
          System.out.print(i);
        }
        System.out.print("\n");
      }
	}
}