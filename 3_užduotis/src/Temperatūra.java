import java.util.Scanner;

public class Temperatûra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double c, f, r, k;

		System.out.println("Temperatûrø skalës.");
		System.out.print("Áveskite temperatûrà Kelvino skalëje: ");
		k = sc.nextDouble();
		sc.close();

		c = k - 273.15;
		f = k * 9 / 5 - 459.67;
		r = c * 4 / 5;

		System.out.println("1. " + String.format("%.2f", c) + " Celsijaus laipsniø");
		System.out.println("2. " + String.format("%.2f", f) + " Farenheito laipsniø");
		System.out.println("3. " + String.format("%.2f", r) + " Reomiûro laipsniø");
		System.out.println("Programa darbà baigë. Aèiû, kad skaièiavote.");


	}

}
