// 경로 : https://www.acmicpc.net/source/94812733
// 시간 : 116ms
// 메모리 : 14032KB

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int count = 0;

        while (stringTokenizer.hasMoreTokens()) {

            boolean isPrime = true;

            int number = Integer.parseInt(stringTokenizer.nextToken());

            if (number == 1) {
                continue;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        System.out.println(count);

    }
}
