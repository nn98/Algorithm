package BaekJoon.String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15814 {

    public static void main(String[] args) throws Exception {
        // T번동안 문자열 S의 A번째 위치에 있는 문자와 B번째 위치에 있는 문자를
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String [] line = str.split("");

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int numA = Integer.parseInt(st.nextToken());
            int numB = Integer.parseInt(st.nextToken());

            String tmp = "";

            tmp = line[numA];
            line[numA] = line[numB];
            line[numB] = tmp;
        }

        for (String s : line) {
            sb.append(s);
        }

        System.out.println(sb.toString());
    }
}
