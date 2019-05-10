import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner s= new Scanner(System.in);
    int r=s.nextInt();
    int c= s.nextInt();
    int matrix[][]=new int[r][c];
    for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
        matrix[i][j]=s.nextInt();
    int transpose[][]=new int[c][r];
    for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
       transpose[j][i]=matrix[i][j];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
        System.out.print(transpose[i][j]+" ");
    System.out.print("\n");
  }}
}