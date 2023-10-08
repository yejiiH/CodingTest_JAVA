import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        if(a>0&&b>0&&a<=10000&&b<=10000) {
        	System.out.println(a+b);
        	System.out.println(a-b);
        	System.out.println(a*b);
        	System.out.println(a/b);
        	System.out.println(a%b);
        }
    }
}