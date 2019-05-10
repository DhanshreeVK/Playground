import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner s= new Scanner(System.in);
      int n= s.nextInt();
      int count=n-1;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=count;j++)
        {
          System.out.print(" ");
          
        }
        for(int k=1;k<=(2*i-1);k++)
        {
          System.out.print("*");
        }
        count--;
        System.out.print("\n");
          
      }
	}
}