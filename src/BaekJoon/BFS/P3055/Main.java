package BaekJoon.BFS.P3055;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Point beaver = null;
        Point cave = null;
        Queue<Point> queue = new LinkedList<>();

        int[][] visited = new int[N][M];
        Arrays.stream(visited).forEach(row -> Arrays.fill(row, Integer.MAX_VALUE));
        String[][] matrix = new String[N][M];
        for (int i = 0; i < N; i++) {
            String[] inputLine = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                matrix[i][j] = inputLine[j];
                if (matrix[i][j].equals("S")) {
                    beaver = new Point(i, j, 0, true);
                }
                if (matrix[i][j].equals("D")) {
                    cave = new Point(i, j, 0);
                }
                if (matrix[i][j].equals("*")) {
                    queue.add(new Point(i, j, 0));
                }
            }
        }
        if (beaver == null || cave == null) {
            return;
        }
        queue.add(beaver);

        int[] xMove = new int[]{0, 1, 0, -1};
        int[] yMove = new int[]{1, 0, -1, 0};

        while (!queue.isEmpty()) {
            Point current = queue.poll();
            int x = current.x;
            int y = current.y;
            int weight = current.weight;
            if (visited[x][y] <= weight) {
                continue;
            }
            visited[x][y] = weight;

            for (int i = 0; i < 4; i++) {
                int nextX = x + xMove[i];
                int nextY = y + yMove[i];
                if (nextX < 0 || nextX >= N || nextY < 0 || nextY >= M) {
                    continue;
                }
                if (matrix[nextX][nextY].equals("X")) {
                    continue;
                }
                if (matrix[nextX][nextY].equals("D") && !current.isBeaver) {
                    continue;
                }
                if (visited[nextX][nextY] <= weight + 1) {
                    continue;
                }
                queue.add(new Point(nextX, nextY, weight + 1, current.isBeaver));
            }
            solution(matrix, visited, 0);
        }
//        Arrays.stream(visited).forEach(row -> System.out.println(Arrays.toString(row)));

        if (visited[cave.x][cave.y] == Integer.MAX_VALUE) {
            bw.write("KAKTUS");
        } else {
            bw.write(String.valueOf(visited[cave.x][cave.y]));
        }
        bw.flush();
    }

    private static void solution(String[][] matrix, int[][] visited, int weight) {

    }

    static class Point {
        int x;
        int y;
        int weight;
        boolean isBeaver;

        public Point(int x, int y, int weight) {
            this.x = x;
            this.y = y;
            this.weight = weight;
        }

        public Point(int x, int y, int weight, boolean isBeaver) {
            this.x = x;
            this.y = y;
            this.weight = weight;
            this.isBeaver = isBeaver;
        }
    }
}
