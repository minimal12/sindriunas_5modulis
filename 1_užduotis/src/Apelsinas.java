import java.util.Scanner;

public class Apelsinas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double d, a, v, r;
		
		System.out.print("Áveskite apelsino skersmená: ");
		d = sc.nextDouble();
		
		System.out.print("Áveskite apelsino þievelës storá: ");
		a = sc.nextDouble();
		sc.close();
		
		r = (d/2)-a;
		
		v = (double)(4.00/3.00)*Math.PI*(r*r*r);

		System.out.println("Apelsino minkðtimo tûris: " + String.format("%.2f", v));

	}

}
