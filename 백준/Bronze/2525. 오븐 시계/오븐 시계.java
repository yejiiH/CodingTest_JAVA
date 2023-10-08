import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int cooking = sc.nextInt();

        if((M+cooking)>=60){
           H = (M+cooking)/60+H;
           M = (M+cooking)%60;
           if(H>=24){
               H=H-24;
               System.out.println(H+" "+M);
           }else {
               System.out.println(H+" "+M);
           }

        }else{
            M=M+cooking;
            System.out.println(H+" "+M);
        }

    }

}
