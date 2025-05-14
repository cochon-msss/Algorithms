// 경로 : https://www.acmicpc.net/source/94301484
// 시간 :124ms
// 메모리 : 15908KB

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(bufferedReader.readLine());
        int B = Integer.parseInt(bufferedReader.readLine());
        int C = Integer.parseInt(bufferedReader.readLine());

        System.out.println(A+B-C);
        System.out.println(Integer.parseInt(A+""+B)-C);

    }
}

