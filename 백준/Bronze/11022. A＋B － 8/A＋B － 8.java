import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer str;
        int a,b;

        for(int i=1;i<=T;i++){
            str = new StringTokenizer(br.readLine());
            a = Integer.parseInt(str.nextToken());
            b = Integer.parseInt(str.nextToken());
            bw.write("Case #"+i+": "+a+" + "+b+" = "+(a+b)+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
