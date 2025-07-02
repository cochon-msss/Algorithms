// 경로 : https://www.acmicpc.net/source/95886804
// 시간 : 108ms
// 메모리 : 14208KB

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int count = 1;
        int range = 2;

        if (N == 1) {
            System.out.println(count);
            return;
        }
        while (range <= N) {
            range += +(6 * count);
            count++;
        }
        System.out.print(count);

    }
}

