package BaekJoon.LCA;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P11437 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(reader.readLine()) + 1;
//        두 노드 중 하나는 부모가 존재한다 가장
//        int[][] parentOf = new int[number][number];
        int[] parentOf = new int[number];
        boolean[] hasParent = new boolean[number];
        hasParent[1] = true;
        for (int i = 1; i < number - 1; i++) {
            String[] input = reader.readLine().split(" ");
            int n0 = Integer.parseInt(input[0]);
            int n1 = Integer.parseInt(input[1]);
            if (hasParent[n0]) {
                parentOf[n1] = n0;
                hasParent[n1] = true;
            } else {
                parentOf[n0] = n1;
                hasParent[n0] = true;
            }
        }
//        for(int a:parentOf) System.out.println(a);
        int vertexes = Integer.parseInt(reader.readLine());
        for (int i = 0; i < vertexes; i++) {
            String[] input = reader.readLine().split(" ");
            int n0 = Integer.parseInt(input[0]);
            int n1 = Integer.parseInt(input[1]);
            boolean[] ca = new boolean[number];
            boolean isParent = true;
            while (isParent) {
                isParent = false;
                ca[n0] = true;
                if (parentOf[n0] > 0) {
                    isParent = true;
                    n0 = parentOf[n0];
                }
            }
//            System.out.println(Arrays.toString(ca));
            isParent = true;
            while (isParent) {
                isParent = false;
                if (ca[n1]) {
                    writer.write(n1 + "\n");
                    break;
                }
                n1 = parentOf[n1];
                isParent = true;
            }
        }
        writer.flush();
    }
}
