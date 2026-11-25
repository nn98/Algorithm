package BaekJoon.BackTracking.P2239;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final int THREE = 3;
    public static final int NINE = 9;
    public static final int[][] sudoku = new int[NINE][NINE];
    public static final boolean[][] verticalUsed = new boolean[NINE][NINE + 1];
    public static final boolean[][] horizontalUsed = new boolean[NINE][NINE + 1];
    public static final boolean[][] blockUsed = new boolean[NINE][NINE + 1];
    public static final List<Point> points = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < NINE; i++) {
            char[] numbers = br.readLine().toCharArray();
            for (int j = 0; j < NINE; j++) {
                int number = numbers[j] - '0';
                int blockIndex = blockIndex(i, j);
                if (number == 0) {
                    Point blankPoint = new Point(i, j);
                    points.add(blankPoint);
                    continue;
                }
                sudoku[i][j] = number;
                verticalUsed[i][number] = true;
                horizontalUsed[j][number] = true;
                blockUsed[blockIndex][number] = true;
            }
        }
        if (!points.isEmpty()) {
            Point start = points.get(0);
            dfs(start.x, start.y, 1);
        }
        for (int[] row : sudoku) {
            for (int number : row) {
                bw.write(String.valueOf(number));
            }
            bw.newLine();
        }

        bw.flush();
    }

    private static int blockIndex(int row, int col) {
        return (row / THREE) * THREE + col / THREE;
    }

    private static boolean dfs(int x, int y, int count) {
        for (int number = 1; number <= NINE; number++) {
            int blockIndex = blockIndex(x, y);
            if (verticalUsed[x][number] || horizontalUsed[y][number] || blockUsed[blockIndex][number]) {
                continue;
            }

            sudoku[x][y] = number;
            verticalUsed[x][number] = true;
            horizontalUsed[y][number] = true;
            blockUsed[blockIndex][number] = true;
            if (count == points.size()) {
                return true;
            }
            Point nextPoint = points.get(count);
            if (dfs(nextPoint.x, nextPoint.y, count + 1)) {
                return true;
            }
            sudoku[x][y] = 0;
            verticalUsed[x][number] = false;
            horizontalUsed[y][number] = false;
            blockUsed[blockIndex][number] = false;
        }
        return false;
    }

    public static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
