import java.util.Scanner;
class Main{
	public static void main (String[] args){
        Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
      long fact=1;
        for(int i = 1; i <= num; ++i)
        {
            fact=fact*i;
        }
                System.out.println(fact);
         
 
	}
}