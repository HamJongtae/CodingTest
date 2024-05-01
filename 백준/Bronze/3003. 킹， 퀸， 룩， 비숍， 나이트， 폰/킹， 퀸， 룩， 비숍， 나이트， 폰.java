import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int king = 1;
		int queen = 1;
		int look = 2;
		int beeshop = 2;
		int knight = 2;
		int phone = 8;
		
		king = 1 - scanner.nextInt();
		queen = 1 - scanner.nextInt();
		look = 2 - scanner.nextInt();
		beeshop = 2 - scanner.nextInt();
		knight = 2 - scanner.nextInt();
		phone = 8 - scanner.nextInt();
		
		System.out.print(king + " ");
		System.out.print(queen + " ");
		System.out.print(look + " ");
		System.out.print(beeshop + " ");
		System.out.print(knight + " ");
		System.out.print(phone);
		scanner.close();
	}
}