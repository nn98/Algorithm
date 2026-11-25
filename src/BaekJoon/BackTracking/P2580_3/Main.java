package BaekJoon.BackTracking.P2580_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

    private static final int THREE = 3;
    private static final int NINE = 9;
    private static final int[][] sudoku = new int[NINE][NINE];
    private static final int[][] vertical = new int[NINE][NINE + 1];
    private static final int[][] horizontal = new int[NINE][NINE + 1];
    private static final int[][] block = new int[NINE][NINE + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < NINE; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < NINE; j++) {
                int number = Integer.parseInt(st.nextToken());
                if (number == 0) {
                    continue;
                }
                sudoku[i][j] = number;
                vertical[i][number] = 1;
                horizontal[j][number] = 1;
                int blockIndex = getBlockIndex(i, j);
                block[blockIndex][number] = 1;
            }
        }
//        Arrays.stream(vertical).forEach(row -> System.out.println(Arrays.toString(row)));
//        System.out.println();
//        Arrays.stream(horizontal).forEach(row -> System.out.println(Arrays.toString(row)));
//        System.out.println();
//        Arrays.stream(block).forEach(row -> System.out.println(Arrays.toString(row)));
        for (int x = 0; x < NINE; x++) {
            for (int y = 0; y < NINE; y++) {
                if (sudoku[x][y] == 0) {
                    dfs(x, y);
                }
            }
        }
        String result = Arrays.stream(sudoku)
                .map(sudokuLine -> Arrays.stream(sudokuLine)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" ")))
                .collect(Collectors.joining("\n"));

        bw.write(result);
        bw.flush();
    }

    private static int getBlockIndex(int i, int j) {
        return (i / 3) * 3 + j / 3;
    }

    static boolean dfs(int x, int y) {
//        System.out.println(x + " " + y);
        int blockIndex = getBlockIndex(x, y);
        for (int i = 1; i <= NINE; i++) {
            if (vertical[x][i] == 0 && horizontal[y][i] == 0 && block[blockIndex][i] == 0) {
                vertical[x][i] = 1;
                horizontal[y][i] = 1;
                block[blockIndex][i] = 1;
                sudoku[x][y] = i;
                int nextX = -1;
                int nextY = -1;
                for (int row = 0; row < NINE && nextX == -1; row++) {
                    for (int col = 0; col < NINE && nextX == -1; col++) {
                        if (sudoku[row][col] == 0) {
                            nextX = row;
                            nextY = col;
                        }
                    }
                }
                if (nextX == -1) {
                    return true;
                }
                if (dfs(nextX, nextY)) {
                    return true;
                }
                vertical[x][i] = 0;
                horizontal[y][i] = 0;
                block[blockIndex][i] = 0;
                sudoku[x][y] = 0;
            }
        }
        return false;
    }

    static boolean isSudokuFinished() {
        int vSum = Arrays.stream(vertical)
                .flatMapToInt(Arrays::stream)
                .sum();
        int hSum = Arrays.stream(horizontal)
                .flatMapToInt(Arrays::stream)
                .sum();
        int bSum = Arrays.stream(block)
                .flatMapToInt(Arrays::stream)
                .sum();
        return vSum == hSum && hSum == bSum && bSum == 81;
    }
}
