import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		boolean asalMi = true;

		System.out.println("Please enter a number to see if it is a prime number or not: ");
		int sayi = number.nextInt();

		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				System.out.println("Your input number is not a prime number.");
				asalMi = false;
				break;
			}
			if (asalMi == true) {
				System.out.println("Your input number is a prime number.");
				break;
			}
		}
	}
}
