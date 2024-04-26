import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); 
		int [] arrays = new int[N];
		
		for(int i=0; i<N; i++) {
			arrays[i] = scanner.nextInt();
		}
		
		int max = arrays[0]; int min = arrays[0];
		for(int i=1; i<N; i++) {
			if(arrays[i] > max) {
				max = arrays[i];
			}
			
			if(arrays[i] < min) {
				min = arrays[i];
			}
		}
		System.out.println(min + " " + max);
		scanner.close();
	}
}