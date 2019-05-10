import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner s= new Scanner(System.in);
      String str1= s.nextLine();
      String str2= s.nextLine();
      String str3=s.nextLine();
     
      System.out.print(str1.replace(str2,str3));                                     
    }
}