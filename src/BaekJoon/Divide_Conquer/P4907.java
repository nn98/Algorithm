import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    // Walsh 행렬의 (r, c) 원소 값: bitcount(r & c)가 짝수면 +1, 홀수면 -1
    static int walsh(int r, int c) {
        return (Integer.bitCount(r & c) & 1) == 0 ? 1 : -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();
            if (line == null) break;            // EOF 안전 처리
            line = line.trim();
            if (line.isEmpty()) continue;       // 빈 줄 스킵

            String[] tok = line.split("\\s+");
            if (tok.length != 4) continue;      // 토큰 4개 아닐 시 스킵

            long N, R, S, E;
            try {
                N = Long.parseLong(tok[0]);
                R = Long.parseLong(tok[1]);
                S = Long.parseLong(tok[2]);
                E = Long.parseLong(tok[3]);
            } catch (NumberFormatException ex) {
                // 숫자가 아닌 값이 섞인 경우 해당 줄 스킵
                continue;
            }

            if (N == -1 && R == -1 && S == -1 && E == -1) {
                break;
            }

            // 문제에서 범위 보장하지만, 방어적 체크(원하면 주석 처리 가능)
            // long maxSize = 1L << N; // N 최대 60 -> 1L<<60 안전 (long 범위 내)
            // if (R < 0 || R >= maxSize || S < 0 || E < S || E >= maxSize) {
            //     // 범위 벗어나면 스킵 또는 0 출력 등 정책 결정
            //     // 여기서는 스킵
            //     continue;
            // }

            long sum = 0;
            // E - S <= 10000 제약 -> 안전하게 반복 가능
            for (long c = S; c <= E; c++) {
                // walsh가 int 인자를 받으므로 long -> int 캐스팅 필요
                // 문제 제약상 R, S, E < 2^N이고 N<=60이지만 실제 반복은 1만1천 내
                // 값 자체는 int 범위를 넘을 수 있으므로 안전하게 처리:
                // walsh 계산은 비트연산이므로 하위 32비트만 쓰면 안 되기에
                // walsh를 long 버전으로 하나 더 만들거나, 여기서 캐스팅 전에 검증.
                // 다만 실제 필요한 비트는 (r & c)의 비트수로, long 지원을 위해 long 버전 구현:

                sum += walshLong(R, c);
            }
            System.out.println(sum);
        }
    }

    // long 인덱스를 지원하는 walsh 버전 (N<=60 대응)
    static int walshLong(long r, long c) {
        // Long.bitCount 사용
        return (Long.bitCount(r & c) & 1) == 0 ? 1 : -1;
    }
}
