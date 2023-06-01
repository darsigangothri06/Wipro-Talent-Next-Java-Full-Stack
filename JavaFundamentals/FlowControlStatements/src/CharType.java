import java.util.Scanner;

public class CharType {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);
		int ascii = (int) ch;
		if (ascii >= 47 && ascii <= 57) {
			System.out.println("Number");
		} else if (ascii >= 65 && ascii <= 122) {
			System.out.println("Alphabet");
		} else
			System.out.println("Symbol");
	}
}
