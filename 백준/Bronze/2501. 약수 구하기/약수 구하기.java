import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		int count = 0;
		
		for(int i=1; i<=A; i++) {
			if(A % i == 0) {
				count++;
			}
			if(count == B) {
				System.out.println(i);
				break;
			}
		}
		if(count < B) {
			System.out.println(0);
		}
		scanner.close();
	}
}
