import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        String no = sc.next();
        int total = 0;

        for(int i=0;i<M;i++){
           total += no.charAt(i)-'0';
            
        }
        System.out.println(total);
    }

}
