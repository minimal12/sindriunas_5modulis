import java.util.Scanner;

public class Temperat�ra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double c, f, r, k;

		System.out.println("Temperat�r� skal�s.");
		System.out.print("�veskite temperat�r� Kelvino skal�je: ");
		k = sc.nextDouble();
		sc.close();

		c = k - 273.15;
		f = k * 9 / 5 - 459.67;
		r = c * 4 / 5;

		System.out.println("1. " + String.format("%.2f", c) + " Celsijaus laipsni�");
		System.out.println("2. " + String.format("%.2f", f) + " Farenheito laipsni�");
		System.out.println("3. " + String.format("%.2f", r) + " Reomi�ro laipsni�");
		System.out.println("Programa darb� baig�. A�i�, kad skai�iavote.");


	}

}
