package BaekJoon.Simple_Implementation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P28015 {

    static int[][] matrix, history;
    static int res, x, y, X, Y, count;

    static void o(int X, int Y, int f) {
        int count1 = f == 1 ? 1 : 0;
        int count2 = f == 2 ? 1 : 0;
        for (int i = X + 1; i < x; i++) {
            if (history[i][Y] > 0) continue;
            if (matrix[i][Y] == 0) break;
            history[i][Y] = matrix[i][Y] == f ? 1 : 0;
        }
        for (int i = Y + 1; i < y; i++) {
            if (history[X][i] > 0) continue;
            if (matrix[X][i] == 0) break;
            history[X][i] = matrix[X][i] == f ? 1 : 0;
        }
        history[X][Y] = 2;
        res += f == 1 ? count1 : count2;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        x = Integer.parseInt(tokenizer.nextToken());
        y = Integer.parseInt(tokenizer.nextToken());
        matrix = new int[x][y];
        history = new int[x][y];
        for (int i = 0; i < x; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 0; j < y; j++) {
                matrix[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }
        for (; X < x; X++) {
            for (Y = 0; Y < y; Y++) {
                if (matrix[X][Y] > 0) {
                    if (history[X][Y] < 1) {
                        o(X, Y, matrix[X][Y]);
                    }
                }
            }
        }
        System.out.println(res);
        for (int[] a : history) System.out.println(Arrays.toString(a));
    }
}

/*
5 5
1 2 1 2 1
2 2 1 2 2
1 1 2 2 1
2 1 1 1 2
2 1 2 1 2
 */