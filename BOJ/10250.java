// 경로 : https://www.acmicpc.net/source/94304670
// 시간 : 120ms
// 메모리 : 17064kb

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine()); // 반복 횟수

        int roomNumber = 1; // 방번호

        for(int i = 0; i < T; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int H = Integer.parseInt(stringTokenizer.nextToken()); // 높이
            int W = Integer.parseInt(stringTokenizer.nextToken()); // 넓이
            int N = Integer.parseInt(stringTokenizer.nextToken());  // 손님

            int count = 0; // 반복 횟수 카운팅

            W_for:for(int w = 0; w < W; w++){ // 넓이
                for(int h = 0; h < H; h++){ // 높이
                    roomNumber += 100;
                    ++count;
                    if(N == count) { // 손님과 카운팅이 같다면 끝
                        System.out.println(roomNumber);
                        roomNumber = 1;
                        break W_for; // 맨 바깥족 반복문 탈출
                    }
                }
                roomNumber -= H * 100 - 1;
            }
        }
    }
}

