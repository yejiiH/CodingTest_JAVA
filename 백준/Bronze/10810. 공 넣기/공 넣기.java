import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	StringTokenizer str = new StringTokenizer(br.readLine()," ");
    	int basket = Integer.parseInt(str.nextToken());
    	int M = Integer.parseInt(str.nextToken());
    	int[] basketArr = new int[basket+1];
    	
    	for(int a=1;a<=M;a++) {
    		StringTokenizer str2 = new StringTokenizer(br.readLine()," ");
    		int from = Integer.parseInt(str2.nextToken());
    		int to = Integer.parseInt(str2.nextToken());
    		int ballNum = Integer.parseInt(str2.nextToken());
    		
    		for(int x=from;x<=to;x++) {
    			basketArr[x]=ballNum;
    		}
    	}
    	for(int y=1;y<=basket;y++) {
    		System.out.print(basketArr[y]+" ");
    	}
    
        
    }

}
