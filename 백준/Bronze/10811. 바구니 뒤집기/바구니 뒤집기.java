import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // n개의 바구니
		int count = scanner.nextInt(); // 시행 횟수

		int temp=0;
		
		int busket[] = new int[n]; 
		for(int i=0;i<busket.length;i++) {
			busket[i] = i+1;	
		}
		
		for(int i=0;i<count;i++) { 
			int a = scanner.nextInt()-1; //1 > 0번째 배열
			int b = scanner.nextInt()-1; //5 > 4번째 배열
			
			while(a<b) { 
				temp = busket[a]; 
				busket[a] = busket[b]; 
				busket[b] = temp; 
				a++;	
				b--;	
			}
		}
		
		for(int i=0;i<busket.length;i++) {
			System.out.print(busket[i]+" ");
		}
		scanner.close();
	}
}