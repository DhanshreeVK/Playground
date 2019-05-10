import java.util.Scanner;
class Main
{
  public static void main(String args[]) 
  {
    // Type your code here
    Scanner s= new Scanner(System.in);
    String str= s.nextLine();
    StringBuilder text=new StringBuilder(str);
    int c=s.nextInt();
    delete_space(text,text.length());
    int l=text.length();
     int r=l/c;
    int char_idx=0;
   
    if((l%c)>0)
      r++;
    for(int i=0;i<c;i++)
     for(int j=0;j<r;j++)
      {
        char_idx=i+j*c;
        if(j%2==1)
        {
          char_idx=((c-1)+j*c)-i;
        }
        char ch;
        if(char_idx>=l)
          ch='X';
        else
          ch=text.charAt(char_idx);
        System.out.print(ch);
      }
    }
  
  public static void delete_space(StringBuilder str,int n)
  {
    StringBuilder temp=new StringBuilder();
    for(int i=0;i<n;i++)
      if(str.charAt(i)!=' ')
        temp.append(str.charAt(i));
    str.setLength(0);
    for(int i=0;i<temp.length();i++)
      str.append(temp.charAt(i));
  }
}