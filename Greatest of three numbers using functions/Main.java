import java.util.Scanner;
class Main{

	public static void main(String[] args) {
		int x, y, z;
		Scanner sc = new Scanner(System.in);		
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		LargestofThree(x, y, z);
	}
	public static void LargestofThree(int x, int y, int z) {
		if (x - y > 0 && x - z > 0) {
			System.out.print(x);
		}
		else {
			if (y -z > 0) {
				System.out.print(y);
			}
			else {
				System.out.print(z);
			}
		}		
	}
}
