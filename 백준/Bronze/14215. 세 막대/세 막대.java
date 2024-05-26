import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int tmp = 0;

        if (a < b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        if (a < c) {
            tmp = a;
            a = c;
            c = tmp;
        }

        while (true) {
            int sum = a + b + c;
            if (b + c > a) {
                System.out.println(sum);
                break;
            } else {
                a--;
            }
        }
		 scanner.close();
	}
}