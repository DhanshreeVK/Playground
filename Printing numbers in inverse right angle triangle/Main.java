import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s= new Scanner(System.in);
      int n= s.nextInt();
      for(int i=n;i>=1;i--)
      {
        int star=i;
        for(int j=star;j>=1;j--)
        {
          System.out.print(j);
        }
        System.out.print("\n");
      }
	}
}