import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X,N,a,b,total;
        total=0;
        X = sc.nextInt();
        N = sc.nextInt();

       for(int i=0;i<N;i++){

           a=sc.nextInt();
           b=sc.nextInt();
           total+=(a*b);
           
       }
        if(X==total){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }

}
