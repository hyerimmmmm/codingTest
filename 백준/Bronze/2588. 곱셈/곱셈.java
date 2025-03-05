import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int a, b, c;

		c = num2 % 10;
		num2 /= 10;

		b = num2 % 10;
		num2 /= 10;

		a = num2 % 10;
		num2 /= 10;
		
		int num5 = num1 * c;
		int num4 = num1 * b;
		int num3 = num1 * a;

		System.out.println(num5);
		System.out.println(num4);
		System.out.println(num3);
		
		System.out.println(num5 + (num4 * 10) + (num3 * 100));
		
	}
}