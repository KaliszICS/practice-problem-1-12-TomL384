import java.util.Scanner ;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
	}

	public static void q1() {
		Scanner ip = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String s1 = ip.nextLine();
		int i1 = Integer.parseInt(s1) + 3;
		System.out.println(i1);
	}

	public static void q2() {
		Scanner ip = new Scanner(System.in);
		System.out.print("Input a number: ");
		String i1 = ip.nextLine() + "4" ;
		double d1 = Double.parseDouble(i1) + 2;
		System.out.println(d1);
	}

	public static void q3() {
		Scanner ip = new Scanner(System.in);
		System.out.print("Input a radius: ");
		String s1 = ip.nextLine();
		double d1 = Double.parseDouble(s1) ;
		System.out.println(d1*d1*3.14);
	}

	public static void q4() {
		Scanner ip = new Scanner(System.in);
		System.out.print("Input a number: ");
		String i1 = ip.nextLine();
		double d1 = Double.parseDouble(i1)*12;
		System.out.println(Math.floor(d1));
	}

}
