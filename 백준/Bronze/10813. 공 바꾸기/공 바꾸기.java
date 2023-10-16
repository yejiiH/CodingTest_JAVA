import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ballNum = new int[n+1];

        for(int i=1;i<=n;i++){
            ballNum[i]=i;
        }
        for(int j=0;j<m;j++){
            int temp = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();

            temp = ballNum[a];
            ballNum[a]=ballNum[b];
            ballNum[b]=temp;

        }
        for(int k=1;k<=n;k++){
            System.out.print(ballNum[k] + " ");
        }


    }

}
