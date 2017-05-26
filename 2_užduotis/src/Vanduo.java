import java.util.Scanner;

public class Vanduo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, bV, r, cV, wV;
		
		System.out.print("�veskite kubo kra�tin�s ilg�: ");
		a = sc.nextDouble();
		
		System.out.print("�veskite rutulio skersmen�: ");
		b = sc.nextDouble();
		sc.close();
		
		r = (b/2.00);
		
		bV = (double)(4.00/3.00)* Math.PI*(r*r*r);
		
		cV = a*a*a;
		
		wV = cV - bV;
		
		System.out.println("\nKubo t�ris " + String.format("%.2f", cV));
		
		System.out.println("Rutulio t�ris " + String.format("%.2f", bV));
		
		System.out.println("Vandens t�ris " + String.format("%.2f", wV));

	}

}
