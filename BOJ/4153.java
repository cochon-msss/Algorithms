// 경로 : https://www.acmicpc.net/source/94777413
// 시간 : 96ms
// 메모리 : 14056KB

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        loop: while (true) {
            String resultString = "wrong";
            String[] triangle = bufferedReader.readLine().split(" ");
            int[] triangle_calcu_lines = new int[3];
            byte index = 0;

            for (String s : triangle) {
                int tringle_line = Integer.parseInt(s);
                if (tringle_line == 0) {
                    break loop;
                }
                triangle_calcu_lines[index++] = (int) Math.pow(tringle_line, 2);
            }

            Arrays.sort(triangle_calcu_lines);

            boolean rightAngleFlag = triangle_calcu_lines[0] + triangle_calcu_lines[1] == triangle_calcu_lines[2];

            if (rightAngleFlag)
                resultString = "right";

            System.out.println(resultString);
        }

    }
}
