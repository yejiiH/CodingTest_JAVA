import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numArr[] = new int[10];
        boolean result;
        int count=0;

        for(int i=0;i<numArr.length;i++){
            numArr[i] = sc.nextInt() % 42;
        }
        for(int i=0;i<numArr.length;i++){
            result=false;
            for(int j=i+1;j<numArr.length;j++){
                if(numArr[i]==numArr[j]) {
                    result=true;
                    break;
                }
            }
            if(result==false)  {
                count++;
            }
        }
        System.out.println(count);
        
    }

}
