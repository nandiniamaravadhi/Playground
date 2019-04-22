import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int list[] = new int[n];
    int ind=0,max=list[0];
for(int i = 0; i < n; i++)
{
list[i] = sc.nextInt();
}
 for(int i=0;i<n;i++)
 {
   if(max<list[i])
   {
     max=list[i];
     ind=i;
   }
 }
    System.out.println(ind);
  }
}