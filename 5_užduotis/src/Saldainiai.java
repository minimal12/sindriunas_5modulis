import java.util.Scanner;

public class Saldainiai {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("�veskite saldaini� mai�elio kain�: ");
		int a = sc.nextInt();

		System.out.print("�veskite pinig� sum� skirt� saldainiams pirkti: ");
		int b = sc.nextInt();
		sc.close();
		
		int bag = 0;
		int coupon = 0;
		int temp = 0;
		int couponLeft = 0;
		
	    bag = b/a;
	    coupon = bag;
	    temp = coupon/3;
	    bag += temp;
	    coupon = temp;
	    temp = coupon/3;
	    couponLeft = coupon-(3*temp);
	    bag += temp;
	    coupon = (coupon-(temp*3))+couponLeft;
	    bag += coupon/3;
	    
	    System.out.println(bag);

	}

}
