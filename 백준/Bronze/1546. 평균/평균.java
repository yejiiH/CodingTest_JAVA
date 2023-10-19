import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] number = new int[sc.nextInt()];
        double max = 0;
        double a = 0;

        for(int i=0;i<number.length;i++){
           number[i]=sc.nextInt();
            if(max<number[i]){
                max=number[i];
            }
        }
        for(int i=0;i<number.length;i++){
            a += (number[i]/max)*100;;
        }
        System.out.println(a/number.length);


    }

}
