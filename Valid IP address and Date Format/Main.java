import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*; 
public class Main{
	
	public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
	    String s= sc.nextLine();
        System.out.println(s + " is valid? "+Main.isValidIP(s));
        String s1 = sc.nextLine();
        System.out.println("Is " + s1+ " a valid date format? " + validateDateFormat(s1));
    }
 
	public static boolean isValidIP(String ipAddr){
         
        Pattern p = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
        Matcher m = p.matcher(ipAddr);
        return m.find();
	}
         public static boolean validateDateFormat(String userName){
            
            Pattern d1 =  Pattern.compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)");
            Matcher m1 = d1.matcher(userName);
            return m1.find();
        }
}
   
	