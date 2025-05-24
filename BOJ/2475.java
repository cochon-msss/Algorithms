// 경로 : https://www.acmicpc.net/source/94708667
// 시간 : 104ms
// 메모리 : 14156KB

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));

        char[] primaryNumber = bufferedReader.readLine().replace(" ","").toCharArray();
        int sum = 0;
        for (char c : primaryNumber) {
            sum += (int) Math.pow(Character.getNumericValue(c), 2);
        }
        System.out.println(sum % 10);
    }
}
