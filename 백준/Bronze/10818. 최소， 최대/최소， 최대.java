import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());
        int max=-1000001;
        int min=1000001;

        for(int i=0;i<N;i++){
            int no = Integer.parseInt(str.nextToken());
            if(max<no){
                max=no;
            }
            if(min>no){
                min=no;
            }

        }

        System.out.print(min+" "+max);


        br.close();
        bw.flush();
        bw.close();
    }

}
