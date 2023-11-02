import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	double total = 0; // 총 학점
    	double result = 0; // 학점 * 과목 평점
    	
    	for(int i=0;i<20;i++) {
    		StringTokenizer str = new StringTokenizer(br.readLine());
    		String subject = str.nextToken();
    		double credit = Double.parseDouble(str.nextToken());
    		String alphabet = str.nextToken(); // 등급
    		double grade = 0;
    		
    		if(!alphabet.equals("P")) {
    			switch(alphabet) {
        		case "A+" :
        			grade = 4.5;
        			break;
        		case "A0" :
        			grade = 4.0;
        			break;
        		case "B+" :
        			grade = 3.5;
        			break;
        		case "B0" :
        			grade = 3.0;
        			break;
        		case "C+" :
        			grade = 2.5;
        			break;
        		case "C0" :
        			grade = 2.0;
        			break;
        		case "D+" :
        			grade = 1.5;
        			break;
        		case "D0" :
        			grade = 1.0;
        			break;	
        		case "F" :
        			grade = 0.0;
        			break;	
        		}
    			total += credit;
        		result += (credit*grade);
    		}
    		
    	}
    	 System.out.printf("%.6f",result/total);
    	br.close();
        }
    
    }




