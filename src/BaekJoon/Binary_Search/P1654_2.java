package BaekJoon.Binary_Search;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P1654_2 {

    private static List<Long> visited = new ArrayList<>();

    private static long solution(long start, long end, List<Integer> lanCable, long N) {
//        System.out.println("start: " + start + " end: " + end + " lanCable: " + lanCable);
        long mid = (start + end) / 2;
        if (visited.contains(mid)) {
            return 0;
        }
        visited.add(mid);
        long cableNum = lanCable.stream()
                .mapToLong(cableLength -> split(cableLength, mid))
                .sum();
        if (cableNum < N) {
            return solution(start, mid - 1, lanCable, N);
        }
        return Long.max(mid, solution(mid + 1, end, lanCable, N));
    }

    private static long split(long cableLength, long splitLength) {
        return cableLength / splitLength;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inputLine = bufferedReader.readLine().split(" ");
        long K = Integer.parseInt(inputLine[0]);
        long N = Integer.parseInt(inputLine[1]);
        List<Integer> lanCables = new ArrayList<>();
        for (long i = 0; i < K; i++) {
            lanCables.add(Integer.parseInt(bufferedReader.readLine()));
        }
        long start = 1;
        long end = Collections.max(lanCables);
        bufferedWriter.write(solution(start, end, lanCables, N) + "");
        bufferedWriter.flush();
    }
}
