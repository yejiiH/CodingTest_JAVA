import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = str.length();
        int count = 0;

        for(int i=0;i<length;i++){

            if(str.charAt(i)=='c'&&i<length-1){
                if(str.charAt(i+1)=='='||str.charAt(i+1)=='-'){
                    i++;
                }
            } else if(str.charAt(i)=='d'&&i<length-1){
                if(str.charAt(i+1)=='-'){
                    i++;
                } else if(str.charAt(i+1)=='z'&&i<length-2){
                    if(str.charAt(i+2)=='='){
                        i+=2;
                    }

                }
            } else if(str.charAt(i)=='l'&&i<length-1){
                if(str.charAt(i+1)=='j'){
                    i++;
                }
            } else if(str.charAt(i)=='n'&&i<length-1){
                if(str.charAt(i+1)=='j'){
                    i++;
                }
            } else if(str.charAt(i)=='s'&&i<length-1){
                if(str.charAt(i+1)=='='){
                    i++;
                }
            } else if(str.charAt(i)=='z'&&i<length-1){
                if(str.charAt(i+1)=='='){
                    i++;
                }
            }
            count ++;

        }
        System.out.println(count);
    }

}
