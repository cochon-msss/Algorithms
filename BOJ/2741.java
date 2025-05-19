// 경로 : https://www.acmicpc.net/source/94519245
// 시간 : 1020ms
// 메모리 : 31648KB

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj_8958 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        for(int i = 1; i <= N; i++)
            System.out.println(i);
    }
}

