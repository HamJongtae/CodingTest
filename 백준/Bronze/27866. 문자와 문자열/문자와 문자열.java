import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String a = scanner.nextLine();
		int b = scanner.nextInt() - 1;
		
		System.out.println(a.charAt(b));
		scanner.close();
	}
}