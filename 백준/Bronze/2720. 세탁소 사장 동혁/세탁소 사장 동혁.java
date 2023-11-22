import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int m = Integer.parseInt(br.readLine());
    	int dollar = 0;
    	int a,b,c,d = 0;
    	for(int i=0;i<m;i++) {
    		int cent = Integer.parseInt(br.readLine());
    		
    		a=cent/25;
    		b=(cent%25)/10;
    		c=((cent%25)%10)/5;
    		d=((cent%25)%10)%5;
    		
    		System.out.println(a+" "+b+" "+c+" "+d);
    		
    		
    	}
    	
    	
        }
    
    }





