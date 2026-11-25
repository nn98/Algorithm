package BaekJoon.BackTracking.P14889;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] availability = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                availability[i][j] = availability[j][i] = matrix[i][j] + matrix[j][i];
            }
        }
        int index = 0;
        boolean[] startTeam = new boolean[N];

        bw.write(String.valueOf(backTracking(index, startTeam, availability, 0)));
        bw.flush();
    }

    private static int backTracking(int index, boolean[] startTeam, int[][] availability, int count) {
        if (index == startTeam.length) {
            if (count == startTeam.length / 2) {
                return availabilityDiff(startTeam, availability);
            }
            return Integer.MAX_VALUE;
        }
        int exclude = backTracking(index + 1, startTeam, availability, count);
        startTeam[index] = true;
        int include = backTracking(index + 1, startTeam, availability, count + 1);
        startTeam[index] = false;
        return Math.min(exclude, include);
    }

    private static int availabilityDiff(boolean[] startTeam, int[][] availability) {
        int startSum = 0;
        int linkSum = 0;
        for (int i = 0; i < startTeam.length; i++) {
            for (int j = i + 1; j < startTeam.length; j++) {
                if (startTeam[i] && startTeam[j]) {
                    startSum += availability[i][j];
                }
                if (!(startTeam[i] || startTeam[j])) {
                    linkSum += availability[i][j];
                }
            }
        }
        return Math.abs(startSum - linkSum);
    }
}
