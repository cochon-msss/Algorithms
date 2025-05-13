// 경로 : https://www.acmicpc.net/problem/1271
// 시간 : 184ms
// 메모리 : 17904KB

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();  // 조교가 가진 돈
        BigInteger m = scanner.nextBigInteger();  // 생명체의 수

        BigInteger divide = n.divide(m);
        BigInteger remainder = n.remainder(m);

        System.out.println(divide);
        System.out.println(remainder);
    }
}

