import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[]a = {scanner.nextInt(), scanner.nextInt()};
		int[]b = {scanner.nextInt(), scanner.nextInt()};
		int[]c = {scanner.nextInt(), scanner.nextInt()};
		int w=0;
		int h=0;
		
		if(a[0] == b[0]) {
			w = c[0];
		}else if(b[0] == c[0]) {
			w = a[0];
		}else if(a[0] == c[0]) {
			w = b[0];
		}
		
		if(a[1] == b[1]) {
			h = c[1];
		}else if(b[1] == c[1]) {
			h = a[1];
		}else if(a[1] == c[1]) {
			h = b[1];
		}
		System.out.println(w + " " + h);
		scanner.close();
	}
}