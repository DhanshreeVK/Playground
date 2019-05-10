import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner s= new Scanner(System.in);
      int n=s.nextInt(),fact,temp,sum=0,d;
      temp=n;
      while(n!=0)
      {
        fact=1;
        d=n%10;
      for(int i=1;i<=d;i++)
      {
        
        fact=fact*i;
      }
        sum=sum+fact;
        n=n/10;
      
      }
      if(sum==temp)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}