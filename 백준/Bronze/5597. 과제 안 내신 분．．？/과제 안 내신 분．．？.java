import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean[] students = new boolean[31];

        for(int i=0;i<28;i++){
            students[sc.nextInt()]=true;
        }
        for(int j=1;j<=30;j++){
            if(!students[j]){
                System.out.println(j);
            }
        }



    }

}
