import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char ascii = scanner.nextLine().charAt(0);
		int as = (int)ascii;
		
		System.out.println(as);
		scanner.close();
	}
}