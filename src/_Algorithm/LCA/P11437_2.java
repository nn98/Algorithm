package _Algorithm.LCA;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class P11437_2 {
    static int number, length, index,sIndex,lIndex;
    //        두 노드 중 하나는 부모가 존재한다 가장
//        int[][] parentOf = new int[number][number];
    static int[] seg, search, sNode,lSeg;
    static int[][] tree;
    static boolean[] visited;

    static void dfs(int x) {
        lSeg[x]=index;
        sNode[++sIndex]=x;
        search[x]=sIndex;
        seg[index++] = x;
        System.out.println(x);
        visited[x] = true;
        for (int i = 0; i < number; i++) {
            if (tree[x][i] > 0 & !visited[i]) {
//                pa[0][i]=x;
                dfs(i);
                seg[index++] = x;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        number = Integer.parseInt(reader.readLine()) + 1;
//        두 노드 중 하나는 부모가 존재한다 가장
//        int[][] parentOf = new int[number][number];
        tree = new int[number][number];
        search = new int[number];
        sNode = new int[number];
        lSeg = new int[number];
//        pa=new int[20][100005];
        for (length = 1; length < number; length *= 2) ;
        seg = new int[length*2];
        visited = new boolean[number];
        for (int i = 1; i < number - 1; i++) {
            String[] input = reader.readLine().split(" ");
            int n0 = Integer.parseInt(input[0]);
            int n1 = Integer.parseInt(input[1]);
            tree[n0][n1] = tree[n1][n0] = 1;
        }
//        for(int a:parentOf) System.out.println(a);
//        for(int[]a:tree) System.out.println(Arrays.toString(a));
//        System.out.println();
        dfs(1);
        for(int[]a:tree) System.out.println(Arrays.toString(a));
        System.out.println("\n"+Arrays.toString(lSeg));
        System.out.println("\n"+Arrays.toString(search));
        System.out.println("\n"+Arrays.toString(sNode));
        System.out.println("\n"+Arrays.toString(seg));
//        for(int[]a:pa) System.out.println(Arrays.toString(a));
//        System.out.println();
//        for(int i=0;i<19;i++){
//            for (int j=1;j<=number;j++){
//                if(pa[i][j]>0){
//                    pa[i+1][j]=pa[i][pa[i][j]];
//                }
//            }
//        }
//        for(int[]a:pa) System.out.println(Arrays.toString(a));
//        System.out.println();
        int vertexes = Integer.parseInt(reader.readLine());
        for (int k = 0; k < vertexes; k++) {
            String[] input = reader.readLine().split(" ");
            int n0 = Integer.parseInt(input[0]);
            int n1 = Integer.parseInt(input[1]);
        }
        writer.flush();
    }
}
