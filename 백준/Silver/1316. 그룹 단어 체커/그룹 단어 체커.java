import java.util.Scanner;

public class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0;
        int no = sc.nextInt();
        for(int i=0;i<no;i++){
            if(check() == true){
                count++;
            }
        }
        System.out.println(count);


    }
    public static boolean check(){
        boolean[] check = new boolean[26];
        String str = sc.next();
        int prev = 0;

        for(int i=0;i<str.length();i++){
            int now = str.charAt(i);

            if(prev != now){ //앞 뒤 문자가 다름
               if(check[now -'a']==false){ // 처음 나오는 문자
                   check[now -'a']=true;
                   prev = now;
               } else if (check[now-'a']==true){ // 이전에 나온적이 있는 문자 (중복된 문자)
                   return false;
               }


            } else { // 연속된 문자, 앞 뒤 문자가 같음
                continue;
            }

        }
        return true;

    }

}
