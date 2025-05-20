// 경로 : https://www.acmicpc.net/source/94555593
// 시간 : 108ms
// 메모리 : 14348kb

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < N; i++){
            String OX = bufferedReader.readLine();
            int OX_result = 0;
            int OX_plus_number = 0;
            for(int j = 0; j < OX.length(); j++){
                char OX_char = OX.charAt(j);
                if(OX_char == 'O'){
                    ++OX_plus_number;
                }else{
                    OX_plus_number = 0;
                }
                OX_result += OX_plus_number;
            }
            System.out.println(OX_result);
        }

    }
}
