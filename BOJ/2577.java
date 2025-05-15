// 경로 : https://www.acmicpc.net/source/94349136
// 시간 : 100ms
// 메모리 : 14028KB

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(bufferedReader.readLine());
        int B = Integer.parseInt(bufferedReader.readLine());
        int C = Integer.parseInt(bufferedReader.readLine());

        int ABC = A * B * C; // 합산
        int ABC_length = String.valueOf(ABC).length(); // 합산 length
        int modulus = 10;
        int divisor = 0;

        int[] number_arr = new int[10]; // 최종 arr

        for(int i = 0; i < ABC_length; i++, modulus *= 10){ // 순차적으로 divisor을 * 10 한다.
            int ABC_result = 0;
            if(divisor == 0){
                ABC_result = ABC % modulus;
                divisor += 10; // 처음은 아무것도 나누지 않아야하기 때문에 결과 저장 후 + 10
            }else{
                ABC_result = (ABC % modulus) / divisor;
                divisor *= 10; // 두 전째부터는 * 10 한다.
            }
            number_arr[ABC_result]++;
        }
        for(int i : number_arr){
            System.out.println(i);
        }

    }
}

