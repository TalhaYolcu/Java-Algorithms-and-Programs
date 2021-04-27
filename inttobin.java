import java.util.Scanner;
public class inttobin {
	private static void decimal_to_bin(int num) {
		if(num>=1) {
			decimal_to_bin(num/2);
			System.out.print(num%2);
		}
	}
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int num=x.nextInt();
		decimal_to_bin(num);
		System.out.println();
	}
}