import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int total=0,count;
      for(count = 1; count <= num; count++)
      {
           total = total + count;
      }
        System.out.println(total);
        
      
	}
}