import java.util.Scanner;

public class D��ut�s {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a1, b1, c1, a2, b2, c2;

		System.out.print("a1: ");
		a1 = sc.nextInt();

		while (a1 > 100) {
			System.out.println("a1: ");
			a1 = sc.nextInt();
		}
		
		System.out.print("b1: ");
		b1 = sc.nextInt();

		while (b1 > 100) {
			System.out.println("b1: ");
			b1 = sc.nextInt();
		}
		
		System.out.print("c1: ");
		c1 = sc.nextInt();

		while (c1 > 100) {
			System.out.println("c1: ");
			c1 = sc.nextInt();
		}
		
		System.out.print("a2: ");
		a2 = sc.nextInt();

		while (a1 > 100) {
			System.out.println("a2: ");
			a2 = sc.nextInt();
		}
		
		System.out.print("b2: ");
		b2 = sc.nextInt();

		while (b2 > 100) {
			System.out.println("b2: ");
			b2 = sc.nextInt();
		}
		
		System.out.print("c2: ");
		c2 = sc.nextInt();

		while (c2 > 100) {
			System.out.println("c2: ");
			c2 = sc.nextInt();
		}

		sc.close();

		if (a1 + b1 + c1 == a2 + b2 + c2) {

			System.out.println("Abi vienod� matmen�");

		}

		else if (a2 > a1 && b2 > b1 && c2 > c1) {

			System.out.println("Pirmoji telpa antrojoje");

		} else if (a1 > a2 && b1 > b2 && c1 > c2) {

			System.out.println("Antroji telpa pirmojoje");

		} else

			System.out.println("D��ut�s nepalyginamos");

	}

}
