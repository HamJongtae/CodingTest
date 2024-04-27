import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int [] arrays = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
		
		int count = 0;
		int max = 0;
		int index = 0;
		
		for(int num : arrays) {
			count ++;
			
			if(num > max) {
				max = num;
				index = count;
			}
		}
		
		System.out.print(max + "\n" + index);
		scanner.close();
	}
}