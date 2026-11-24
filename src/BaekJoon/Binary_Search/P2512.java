package BaekJoon.Binary_Search;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2512 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int M = Integer.parseInt(bufferedReader.readLine());
        int[] required = new int[N];
        for (int i = 0; i < N; i++) {
            required[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(required);
        bufferedWriter.write(String.valueOf(solution(required, 0, M)));
        bufferedWriter.flush();
    }

    private static int solution(int[] required, int beginIndex, int m) {
        int sum = Arrays.stream(required, beginIndex, required.length).sum();
        int range = required.length - beginIndex;
        if (sum <= m) {
            return required[required.length - 1];
        }
        int sharedBudget = m / range;
        if (required[beginIndex] <= sharedBudget) {
            return solution(required, beginIndex + 1, m - required[beginIndex]);
        }
        return sharedBudget;
    }
}
