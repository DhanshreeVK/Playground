import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
     Scanner s= new Scanner(System.in);
      int n= s.nextInt();
      int c=0,temp;
      temp=n;
      while(n!=0)
      {
        n=n/10;
        c++;
      }
      
      
     int d=1;
      for(int i=1;i<=(c-2);i++)
      {
        d=d*10;
      }
      int n2=temp/d;
      n2=n2%10;
      System.out.println(n2);
	}
}