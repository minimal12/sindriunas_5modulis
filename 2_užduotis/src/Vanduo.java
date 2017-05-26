import java.util.Scanner;

public class Vanduo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, bV, r, cV, wV;
		
		System.out.print("Áveskite kubo kraðtinës ilgá: ");
		a = sc.nextDouble();
		
		System.out.print("Áveskite rutulio skersmená: ");
		b = sc.nextDouble();
		sc.close();
		
		r = (b/2.00);
		
		bV = (double)(4.00/3.00)* Math.PI*(r*r*r);
		
		cV = a*a*a;
		
		wV = cV - bV;
		
		System.out.println("\nKubo tûris " + String.format("%.2f", cV));
		
		System.out.println("Rutulio tûris " + String.format("%.2f", bV));
		
		System.out.println("Vandens tûris " + String.format("%.2f", wV));

	}

}
