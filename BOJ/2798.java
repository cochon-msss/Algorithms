// 경로 : https://www.acmicpc.net/source/94850940
// 시간 : 168ms
// 메모리 : 15588KB

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        stringTokenizer.nextToken(); // N 의미없는 숫자
        int M = Integer.parseInt(stringTokenizer.nextToken()); // max number

        String[] card_numbers_str = bufferedReader.readLine().split(" ");

        int blackJack = 0;

        for (int i = 0; i <= card_numbers_str.length - 3; i++) {
            for (int j = i + 1; j <= card_numbers_str.length - 2; j++) {
                for (int k = j + 1; k <= card_numbers_str.length - 1; k++) {
                    int tempBlackJack = Integer.parseInt(card_numbers_str[i]) + Integer.parseInt(card_numbers_str[j])
                            + Integer.parseInt(card_numbers_str[k]);
                    if (blackJack < tempBlackJack && tempBlackJack <= M) {
                        blackJack = tempBlackJack;
                    }
                }
            }
        }
        System.out.println(blackJack);

    }
}

