// 7
import java.util.Scanner;
public class CharReverseCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);
		int ascii = (int) ch;

		if (ascii >= 65 && ascii <= 90) {
			ascii += 32;
			ch = (char) ascii;
			System.out.println(ch);
		} else {
			ascii -= 32;
			ch = (char) ascii;
			System.out.println(ch);
		}
	}
}
