import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		scanner.nextLine();
		for(int i=1; i <= T; i++) {
			String word = scanner.nextLine();
			System.out.print(word.charAt(0));
			System.out.println(word.charAt(word.length()-1));
		}
		scanner.close();
	}
}