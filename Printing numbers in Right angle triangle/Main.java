import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
  		  		
  		int p = in.nextInt();
      for(int n=1;n<=p;n++)
      {
        for(int m=1;m<=n;m++)
        {
          System.out.print(n);
        }
        System.out.print("\n");
      }
	}
}