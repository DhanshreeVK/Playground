import java.util.*;
public class Main<T> 
{ 
  
     private T t1;
     public void insert(T t1) 
     {
     this.t1 = t1;
     }
     public T get() 
     {
     return t1;
     }
  public static void main(String[] args) 
     { 
        Scanner sc = new Scanner(System.in);
         
         Main<Integer> in = new Main<Integer>();
         int num = sc.nextInt();
         in.insert(num);
    
         Main<String> stri = new Main<String>();
         String str1 = sc.next();
         stri.insert(str1);
         
         Main<Float>  flo= new Main<Float>();
         float f = sc.nextFloat();
         flo.insert(f);
         
         System.out.println("Integer Value: " + in.get());
         System.out.println("String Value: " + stri.get());
         System.out.println("Float value: " + flo.get());
    }
}