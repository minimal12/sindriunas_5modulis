
public class Kontrolinis {

	public static void main(String[] args) {

		int five = 0;
		int four = 0;
		int three = 0;
		int two = 0;
		int mok = 1;

		while (mok < 50) {

			if (mok % 7 == 0 && mok % 3 == 0 && mok % 2 == 0) {
				five = mok / 7;
				four = mok / 3;
				three = mok / 2;
				two = mok - (five + four + three);
				break;
			}
			mok++;
		}
		System.out.println("Kontrolinio rezultatai: ");
		System.out.println("Klas�je mokosi " + mok + " mokiniai");
		System.out.println("Klas�je " + five + " mokiniai gavo penketus");
		System.out.println("Klas�je " + four + " mokiniai gavo ketvertus");
		System.out.println("Klas�je " + three + " mokiniai gavo trejetus");
		System.out.println("Klas�je " + two + " mokini� gavo nepatenkinam� pa�ym�");


	}

}
