import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); 

		int[] number = new int[N];
		for(int i=0; i<N; i++) {
			number[i] = scanner.nextInt();
		}

		int v = scanner.nextInt();
		int count = 0;

		for(int i=0; i< N; i++) {
			if(number[i] == v) {
				count ++;
			}
		}
		System.out.println(count);
		scanner.close();
	}
}