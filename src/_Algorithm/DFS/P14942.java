package _Algorithm.DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P14942 {
    static class Connect {
        int target;
        int value;

        Connect(int target, int value) {
            this.target = target;
            this.value = value;
        }
    }

    static int number, power[], i, from, to, length;

    static List<Connect>[] cave;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        number = Integer.parseInt(reader.readLine());
        power = new int[number];
        cave = new List[number + 1];
        for (i = 0; i < number; power[i++] = Integer.parseInt(reader.readLine()), cave[i] = new ArrayList<>()) ;
        for (i = 1; i < number; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            from = Integer.parseInt(st.nextToken());
            to = Integer.parseInt(st.nextToken());
            length = Integer.parseInt(st.nextToken());
            cave[from].add(new Connect(to, length));
            cave[to].add(new Connect(from, length));
        }
    }
}
