import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);

    	int no = sc.nextInt();
    	
    	for(int i=0;i<no;i++) {
    		int loop = sc.nextInt();
        	String S = sc.next();
        	for(int j=0;j<S.length();j++) {
    			for(int k=0;k<loop;k++) {
    				System.out.print(S.charAt(j));
    			}
    		}
        System.out.println();
    	}
    }

}
