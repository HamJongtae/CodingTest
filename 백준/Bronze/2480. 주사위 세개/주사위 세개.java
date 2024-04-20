import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a == b) {
			if(a == c) {
				System.out.println(10000 + a * 1000);
			}else {
				System.out.println(1000 + a * 100);
			}
		}else if(b == c) {
			if(b == a) {
				System.out.println(10000 + b * 1000);
			}else {
				System.out.println(1000 + b * 100);
			}
		}else if(c == a) {
			if(c == b) {
				System.out.println(10000 + c * 1000);
			}else {
				System.out.println(1000 + c * 100);
			}
		}else{
			if(a > b) {
				if(a > c) {
					System.out.println(a * 100);
				}else if( a < c) {
					System.out.println(c * 100);
				}
			}else if(a < b) {
				if(b > c) {
					System.out.println(b * 100);
				}else if(b < c) {
					System.out.println(c * 100);
				}
			}
		}
		scanner.close();
	}
}