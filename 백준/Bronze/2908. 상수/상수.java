import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int no1 = sc.nextInt();
       int no2 = sc.nextInt();

       no1 = (no1%10)*100 + (no1%100)/10*10 + no1/100;
       no2 = (no2%10)*100 + (no2%100)/10*10 + no2/100;
        System.out.println(no1>no2?no1:no2);
       
    }

}
