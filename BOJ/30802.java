// 경로 : https://www.acmicpc.net/source/94814445
// 시간 : 132ms
// 메모리 : 14300KB

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine()); // 참가자 수

        StringTokenizer tshirtApplicants = new StringTokenizer(bufferedReader.readLine(), " "); // 티셔츠 사이즈별 신청사 수
                                                                                                // s,m,l,xl,xxl,xxxl

        StringTokenizer bundles = new StringTokenizer(bufferedReader.readLine(), " "); // 티셔츠와 펜 묶음 수
        int tshirtBundle = Integer.parseInt(bundles.nextToken());
        int penBundle = Integer.parseInt(bundles.nextToken());

        int buyTshirtBundle = 0;
        while (tshirtApplicants.hasMoreTokens()) {
            int applicant = Integer.parseInt(tshirtApplicants.nextToken());
            // 각 사이즈마다 필요한 티셔츠 묶음 계산 (올림 처리)
            buyTshirtBundle += (applicant + tshirtBundle - 1) / tshirtBundle;
        }

        System.out.println(buyTshirtBundle); // 티셔츠 묶음 수
        System.out.printf("%d %d", N / penBundle, N % penBundle); // 펜 묶음 수와 남는 개수

    }
}
