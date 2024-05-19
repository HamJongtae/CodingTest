import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 int x = scanner.nextInt();
		 int y = scanner.nextInt();
		 int w = scanner.nextInt();
		 int h = scanner.nextInt();
		 int min = x;
		 if(min > w-x) {
			 min = w-x;
		 }
		 if(min > y) {
			 min = y;
		 }
		 if(min > h-y) {
			 min = h-y;
		 }
		 System.out.println(min);
		 scanner.close();
	}
}