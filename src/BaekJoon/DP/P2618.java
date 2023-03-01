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
    static Integer[][] h;
    static List<Coordinate> list = new ArrayList<>();
    static char[] route, rRoute;

    //    static void o(int x1, int y1, int x2, int y2, int index, int value) {
////        System.out.println(x1 + " " + y1 + " " + x2 + " " + y2 + " " + index + " " + value + "\n" + route);
//        if (index == m) {
//            if (r < 0 | r > value) {
//                r = value;
//                rRoute = Arrays.copyOf(route,m);
//            }
//            return;
//        }
//        Coordinate target = list.get(index);
//        int distance = Math.abs(x1 - target.x) + Math.abs(y1 - target.y);
//        route[index] = '1';
//        o(target.x, target.y, x2, y2, index + 1, value + distance);
//        distance = Math.abs(x2 - target.x) + Math.abs(y2 - target.y);
//        route[index] = '2';
//        o(x1, y1, target.x, target.y, index + 1, value + distance);
//    }
    static int o(int x1, int x2) {
        System.out.println(x1 + 1 + " " + (x2 + 1));
        if (h[x1 + 1][x2 + 1] != null) {
            System.out.println("\t" + (x1 + 1) + " " + (x2 + 1));
            for (Integer[] a : h) System.out.println("\t\t" + Arrays.toString(a));
            return h[x1 + 1][x2 + 1];
        }
        int x = (x1 > x2 ? x1 : x2) + 1;
        if (x == m) {
            h[x1 + 1][x2 + 1] = 0;
            System.out.println("\t" + (x1 + 1) + " " + (x2 + 1));
            for (Integer[] a : h) System.out.println("\t\t" + Arrays.toString(a));
//            return h[x1 + 1][x2 + 1] = 0;
            return h[x1 + 1][x2 + 1];
        }
        Coordinate target = list.get(x);
        int i = target.x, j = target.y;
        int i1 = 1, j1 = 1, i2 = n, j2 = n;
        if (x1 >= 0) {
            target = list.get(x1);
            i1 = target.x;
            j1 = target.y;
        }
        if (x2 >= 0) {
            target = list.get(x2);
            i2 = target.x;
            j2 = target.y;
        }
        int distance1 = Math.abs(i - i1) + Math.abs(j - j1) + o(x, x2);
        System.out.println("\td1: "+distance1);
        int distance2 = Math.abs(i - i2) + Math.abs(j - j2) + o(x1, x);
        System.out.println("\td2: "+distance2);
        h[x1 + 1][x2 + 1] = Math.min(distance1, distance2);
//        System.out.println("\t"+x1 + " " + x2);
        System.out.println("\t" + (x1 + 1) + " " + (x2 + 1));
        for (Integer[] a : h) System.out.println("\t\t" + Arrays.toString(a));
        return h[x1 + 1][x2 + 1];
//        return h[x1+1][x2+1]=Math.min(distance1,distance2);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(reader.readLine());
        m = Integer.parseInt(reader.readLine());
        a = new int[n][n];
        route = new char[m];
        h = new Integer[m + 1][m + 1];
        for (; i < m; i++) {
            String[] input = reader.readLine().split(" ");
            list.add(new Coordinate(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
        }
        r = o(-1, -1);
        writer.write(r + "\n");
//        for (char c : rRoute) writer.write(c + "\n");
        writer.flush();
    }
}
