import java.util.Scanner;
class Main{
  public static int greatest_two(int a,int b)
  {
    if(a>b)
      return a;
    else
      return b;
   }
	public static void main (String[] args){
	    // Type your code here
      Scanner s= new Scanner(System.in);
      int n1= s.nextInt();
      int n2= s.nextInt();
      int n3= s.nextInt();
      int r=greatest_two(n1,n2);
      r=greatest_two(r,n3);
      System.out.println(r);
	}
}