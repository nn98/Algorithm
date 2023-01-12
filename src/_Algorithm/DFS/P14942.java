package _Algorithm.DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P14942 {
    static int number, power[], i, cave[][], from, to, length;

    //    static List<Integer>
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        number = Integer.parseInt(reader.readLine());
        power = new int[number];
        cave = new int[number][number];
        for (i = 0; i < number; power[i++] = Integer.parseInt(reader.readLine())) ;
        for (i = 1; i < number; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            from = Integer.parseInt(st.nextToken());
            to = Integer.parseInt(st.nextToken());
            length = Integer.parseInt(st.nextToken());
            cave[from][to] = cave[to][from] = length;
        }
    }
}
