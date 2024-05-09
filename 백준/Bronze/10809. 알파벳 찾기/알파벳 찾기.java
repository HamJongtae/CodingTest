import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] array = new int[26];
		
		for(int i=0; i<array.length; i++) {
			array[i] = -1;
		}
		
		String a = scanner.nextLine();
		
		for(int i=0; i< a.length(); i++) {
			char b = a.charAt(i);
			
			if(array[b - 'a'] == -1) {
				array[b - 'a'] = i;
			}
		}
		
		for(int i=0; i< array.length; i++) {
			System.out.print(array[i] + " ");
		}
        scanner.close();
	}
}