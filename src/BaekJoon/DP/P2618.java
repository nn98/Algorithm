package BaekJoon.DP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P2618 {
    static class Coordinate {
        int x;
        int y;

        Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int n, m, i, r = -1;
    static int[][] a;
    static boolean[][] h;
    static List<Coordinate> list = new ArrayList<>();
    static char[] route, rRoute;

    static void o(int x1, int y1, int x2, int y2, int index, int value) {
//        System.out.println(x1 + " " + y1 + " " + x2 + " " + y2 + " " + index + " " + value + "\n" + route);
        if (index == m) {
            if (r < 0 | r > value) {
                r = value;
                rRoute = Arrays.copyOf(route,m);
            }
            return;
        }
        Coordinate target = list.get(index);
        int distance = Math.abs(x1 - target.x) + Math.abs(y1 - target.y);
        route[index] = '1';
        o(target.x, target.y, x2, y2, index + 1, value + distance);
        distance = Math.abs(x2 - target.x) + Math.abs(y2 - target.y);
        route[index] = '2';
        o(x1, y1, target.x, target.y, index + 1, value + distance);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(reader.readLine());
        m = Integer.parseInt(reader.readLine());
        a = new int[n][n];
        route = new char[m];
        h = new boolean[2][n];
        for (; i < m; i++) {
            String[] input = reader.readLine().split(" ");
            list.add(new Coordinate(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
        }
        o(0, 0, n - 1, n - 1, 0, 0);
        writer.write(r + "\n");
        for (char c : rRoute) writer.write(c + "\n");
        writer.flush();
    }
}
