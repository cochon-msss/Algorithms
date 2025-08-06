// 경로 : https://www.acmicpc.net/problem/10989
// 시간 : 2320ms
// 메모리 : 363912KB

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append('\n');
        }

        System.out.println(sb);
    }

}
