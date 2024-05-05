import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int [] array = new int [N];
		
		for(int i=0; i<N; i++) {
			array[i]= i+1;
		}
		
		for(int i=0; i<M; i++) {
			int tmp;
			int I = scanner.nextInt();
			int J = scanner.nextInt();
			tmp = array[I-1];
			array[I-1] = array[J-1];
			array[J-1] = tmp;
		}
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		scanner.close();
	}
}