import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	int[] arr = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
    	int max = 1;
    	int no = 0;
    	
    	for(int i=0;i<arr.length;i++) {
    		if(max<arr[i]) {
    			max=arr[i];
    			no = i+1;
    		}
    		
    	}
    	
    	System.out.println(max);
    	System.out.println(no);
        
    }

}
