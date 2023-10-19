import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] word = new String[T];

        for(int i=0;i<T;i++){
            word[i] = sc.next();
            int length = word[i].length();
            System.out.println(word[i].charAt(0)+""+word[i].charAt(length-1));
        }


    }

}
