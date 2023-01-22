package _Algorithm.LCA;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class P11437_2 {
    static int number;
    //        두 노드 중 하나는 부모가 존재한다 가장
//        int[][] parentOf = new int[number][number];
    static int[][] tree;
    static boolean[] visited;
    static void dfs(int x){
        System.out.println(x);
        visited[x]=true;
        for(int i=0;i<number;i++) {
            if (tree[x][i] > 0 & !visited[i])
                dfs(i);
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        number = Integer.parseInt(reader.readLine()) + 1;
//        두 노드 중 하나는 부모가 존재한다 가장
//        int[][] parentOf = new int[number][number];
        tree = new int[number][number];
        visited = new boolean[number];
        for (int i = 1; i < number - 1; i++) {
            String[] input = reader.readLine().split(" ");
            int n0 = Integer.parseInt(input[0]);
            int n1 = Integer.parseInt(input[1]);
            tree[n0][n1]=tree[n1][n0]=1;
        }
//        for(int a:parentOf) System.out.println(a);
        dfs(1);
        int vertexes = Integer.parseInt(reader.readLine());

        writer.flush();
    }
}
