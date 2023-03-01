package BaekJoon.DP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
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

    static int n, m, i, j, x1, y1, x2 = n - 1, y2 = n - 1, r = -1;
    static int[][] a;
    static boolean[][] h;
    static List<Coordinate> list = new ArrayList<>();
    static StringBuffer rRoute;

    static void o(int x1, int y1, int x2, int y2, int index, int value, StringBuffer route) {
        System.out.println(x1 + " " + y1 + " " + x2 + " " + y2 + " " + index + " " + value + " " + route);
        if (index == m) {
            if (r < 0 | r>value) {
                r = value;
                rRoute = route;
            }
            return;
        }
        Coordinate target = list.get(index);
        int distance = Math.abs(x1 - target.x) + Math.abs(y1 - target.y);
        o(target.x, target.y, x2, y2, index + 1, value + distance, route.append("1\n"));
        distance = Math.abs(x2 - target.x) + Math.abs(y2 - target.y);
        o(x1, y1, target.x, target.y, index + 1, value + distance, route.append("2\n"));
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(reader.readLine());
        m = Integer.parseInt(reader.readLine());
        a = new int[n][n];
        h = new boolean[2][n];
        for (; m-- > 0; ) {
            String[] input = reader.readLine().split(" ");
            i = Integer.parseInt(input[0]);
            j = Integer.parseInt(input[1]);
            list.add(new Coordinate(i, j));
        }
        o(0, 0,n-1,n-1,0,0,new StringBuffer());
        writer.write(r+"\n");
        writer.write(rRoute.toString());
    }
}
