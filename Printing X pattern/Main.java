import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int size=in.nextInt();
         int i,j;
    
     for(i=0; i < size ;i++)
    {
      
        for(j=0; j < size ;j++)
        {
             if(i==j || j==(size-i-1))
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
       
        System.out.print("\n");
   
}
	}
}