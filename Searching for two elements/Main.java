import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner s= new Scanner(System.in);
      int size= s.nextInt();
      int arr[]= new int[size];
      for(int i=0;i<size;i++)
      {
        arr[i]= s.nextInt();
      }
      int n1= s.nextInt();
      int n2= s.nextInt();
      int r1=-1,r2=-1;
      for(int i=0;i<size;i++)
      {
        if(n1==arr[i])
          r1=i;
        else if(n2==arr[i])
          r2=i;
        
      } 
      System.out.println(r1+"\n"+r2);
    }
}