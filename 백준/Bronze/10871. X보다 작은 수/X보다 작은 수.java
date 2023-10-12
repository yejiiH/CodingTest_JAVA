import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max =sc.nextInt();
		
		for(int i=0;i<N;i++) {
			int no = sc.nextInt();
			if(max>no) {
				System.out.print(no+" ");
			}
		}
	
		sc.close();
		
		
	}
	
}
