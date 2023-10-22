import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	String s = sc.next();
    	char[] s1 = new char[s.length()]; 
    	char[] s2 = new char[s.length()]; 
    	
    	for(int i=0;i<s.length();i++) {
    		s1[i] = s.charAt(i);
    		
    	}
    	for(int i=0, j=s.length()-1;j>=0;j--,i++) {
			s2[j] = s.charAt(i);
		}
    	String str1 = new String(s1);
    	String str2 = new String(s2);
    	if(str1.equals(str2)) {
    		System.out.println("1");
    	} else {
    		System.out.println("0");
    	}
    	
        }
    
    }



