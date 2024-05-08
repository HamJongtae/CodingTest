import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		double [] score = new double [N];
		for(int i=0; i<score.length; i++) {
			score[i] = scanner.nextInt();
		}
		
		double sum = 0;
		Arrays.sort(score);
		
		for(int i=0; i<score.length; i++) {
			sum += score[i]/score[score.length - 1] * 100;
		}
		System.out.println(sum/score.length);
        scanner.close();
	}
}