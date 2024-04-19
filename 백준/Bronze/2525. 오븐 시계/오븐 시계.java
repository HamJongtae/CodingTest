import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
	
		int min = 60 * A + B;
		min += C;
		
		if(min / 60 >= 24) {
			A = (min / 60) % 24;
			B = min % 60;
		}else {
			A = (min / 60);
			B = min % 60;
		}
		System.out.println(A + " " + B);
		scanner.close();
	}
}