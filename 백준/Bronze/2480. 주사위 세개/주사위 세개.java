
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a!=b && b!=c && c!=a) { 
			int max = 0;
			
			if(a>b) { 
				if(c>a) {
					max=c;
				} else {
					max=a;
				}
			} else if(b>a) {
				if(c>b) {
					max=c;
				}else {
					max=b;
				}
			} else if(a>c) {
				if(b>a) {
					max=b;
				}else {
					max=a;
				}
			}
			System.out.println(max*100);
			
		} else if(a==b && b==c && c==a) { 
			System.out.println(10000+a*1000);
			
		} else { 
			if(a==b||a==c) {
				System.out.println(1000+a*100);
			} else if(b==c) {
				System.out.println(1000+b*100);
			}
		}
		
		
		
	}
	
}
