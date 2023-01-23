package _Algorithm.LCA;
// 풀이 수정
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P11437_2 {
    static int number, length, index, sIndex;
    //        두 노드 중 하나는 부모가 존재한다 가장
//        int[][] parentOf = new int[number][number];
    static int[] no2serial, serial2no, locInTrip, tree;
    static List<Integer> trip = new ArrayList<>();
    static List<Integer>[] list;
    static boolean[] visited;

    static void dfs(int x) {
//        누락
        locInTrip[x] = index++;
        serial2no[++sIndex] = x;
        no2serial[x] = sIndex;
//        오답
        trip.add(no2serial[x]);
//        System.out.println(x);
        visited[x] = true;
        for (int i : list[x]) {
            if (!visited[i]) {
                dfs(i);
//                  오답
                trip.add(no2serial[x]);
//                  누락
                index++;
            }
        }
    }

    static int getTreeSize(int size) {
        int h = (int) Math.ceil(Math.log(size) / Math.log(2)) + 1;
        return (int) Math.pow(2, h) - 1;
    }

    static int init(int start, int end, int node) {
//        System.out.println(start+" "+end+" "+node);
        if (start == end) {
//            System.out.println(node + ":" + trip.get(start));
            return tree[node] = trip.get(start);
        }
        int mid = (start + end) / 2;
        return tree[node] = Math.min(init(start, mid, node * 2), init(mid + 1, end, node * 2 + 1));
    }

    static int query(int n, int s, int e, int l, int r) {
        if (r < s | e < l) return Integer.MAX_VALUE;
        if (l <= s && e <= r) return tree[n];
        int m = (s + e) / 2;
        return Math.min(query(n * 2, s, m, l, r), query(n * 2 + 1, m + 1, e, l, r));
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        number = Integer.parseInt(reader.readLine()) + 1;
//        두 노드 중 하나는 부모가 존재한다 가장
//        int[][] parentOf = new int[number][number];
        list = new List[number];
        for (int i = 0; ++i < number; list[i] = new ArrayList<>()) ;
        no2serial = new int[number];
        serial2no = new int[number];
        locInTrip = new int[number];
//        pa=new int[20][100005];
        visited = new boolean[number];
        for (int i = 1; i < number - 1; i++) {
            String[] input = reader.readLine().split(" ");
            int n0 = Integer.parseInt(input[0]);
            int n1 = Integer.parseInt(input[1]);
            list[n0].add(n1);
            list[n1].add(n0);
        }
//        for(int a:parentOf) System.out.println(a);
//        for(int[]a:list) System.out.println(Arrays.toString(a));
//        System.out.println();
        dfs(1);
        length = trip.size();
        tree = new int[getTreeSize(length)];
        init(0, length - 1, 1);
//        for (List a : list) System.out.println(a);
//        System.out.println("\n" + Arrays.toString(locInTrip));
//        System.out.println("\n" + Arrays.toString(no2serial));
//        System.out.println("\n" + Arrays.toString(serial2no));
//        System.out.println("\n" + trip);
//        System.out.println("\n" + Arrays.toString(tree));
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
            n0=locInTrip[n0];
            n1=locInTrip[n1];
            if(n0>n1){
                int temp=n0;
                n0=n1;
                n1=temp;
            }
            writer.write(serial2no[query(1,0,length-1,n0,n1)]+"\n");
        }
        writer.flush();
    }
}
