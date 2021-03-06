import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jinhyuk on 2017. 9. 22..
 */
public class p2231 {
    //분해합 문제. 자리수를 분해한다음 원래 값에 더하여 해당 값을 찾는 문제. 브루트 포스 각각 다 해보면 됨.
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String s_n;

    void input() throws IOException{
        s_n = bufferedReader.readLine();
    }

    void solve(){
        int le = s_n.length();
        int n = Integer.parseInt(s_n);
        int te;
        int sum = 0;
        boolean is = true;
        for (int i = n-(9*le); i <=n-le; i++) {
            te = i;
            sum += te;
            while (te != 0) {
                sum += te % 10;
                te /= 10;
            }
            if (sum == n) {
                System.out.println(i);
                is = false;
                break;
            }
                sum = 0;
        }
        if(is) System.out.println(0);

    }
    public static void main(String[] args) {
        p2231 test = new p2231();
        try{
            test.input();
            test.solve();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
