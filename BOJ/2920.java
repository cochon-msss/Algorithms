// 경로 : https://www.acmicpc.net/source/94709723
// 시간 : 132ms
// 메모리 : 14180KB

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        char[] sequence_arr = bufferedReader.readLine().replace(" ","").toCharArray();

        boolean isAscending = true;
        boolean isDescending = true;

        for(int i = 0; i < sequence_arr.length - 1; i++){
            int current = Character.getNumericValue(sequence_arr[i]);
            int next = Character.getNumericValue(sequence_arr[i + 1]);

            if (current < next) {
                isDescending = false;
            } else if (current > next) {
                isAscending = false;
            }
        }

        String result = "mixed";;
        if (isAscending) {
            result = "ascending";
        } else if (isDescending) {
            result = "descending";
        }

        System.out.println(result);
    }
}

