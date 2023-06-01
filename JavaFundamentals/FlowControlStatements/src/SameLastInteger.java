import java.util.Scanner;

public class SameLastInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a == b  % 10) System.out.println(true);
		else System.out.println(false);
	}

}
