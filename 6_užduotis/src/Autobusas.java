import java.util.Scanner;

public class Autobusas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Kada autobusas iðvyko ið Vilniaus? ");
		int vi = sc.nextInt();
		int mi = sc.nextInt();
		
		System.out.print("Kiek laiko autobusas vaþiavo ið Vilniaus i Panevëþá? ");
		int vp = sc.nextInt();
		int mp = sc.nextInt();
		
		System.out.println("Kelias minutes autobusas stovëjo Panevëþyje?");
		int ms = sc.nextInt();
		
		System.out.println("Kiek laiko autobusas vaþiavo ið Panevëþio á Rygà?");
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
		
		System.out.println("Autobusas á Rygà atvyks " + v + " val. " + m + " min.");

	}

}
