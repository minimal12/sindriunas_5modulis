import java.util.Scanner;

public class Autobusas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Kada autobusas i�vyko i� Vilniaus? ");
		int vi = sc.nextInt();
		int mi = sc.nextInt();
		
		System.out.print("Kiek laiko autobusas va�iavo i� Vilniaus i Panev���? ");
		int vp = sc.nextInt();
		int mp = sc.nextInt();
		
		System.out.println("Kelias minutes autobusas stov�jo Panev��yje?");
		int ms = sc.nextInt();
		
		System.out.println("Kiek laiko autobusas va�iavo i� Panev��io � Ryg�?");
		int vr = sc.nextInt();
		int mr = sc.nextInt();
		sc.close();
		
		int v = vi + vp + vr;
		int m = mi + mp + ms + mr;
		
		if(m >= 60) {
			v += m / 60;
			m = m % 60;
			
		}
		if(v >= 24) {
		v = v - 24;

		}
		
		System.out.println("Autobusas � Ryg� atvyks " + v + " val. " + m + " min.");

	}

}
