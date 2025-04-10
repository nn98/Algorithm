package BaekJoon.BFS;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P27211_2 {

//    static int[][] area, visit;
    static List<List<Integer>> area = new ArrayList<>();
    static List<List<Integer>> visit = new ArrayList<>();
    static int[]X= {-1,0,1,0};
    static int[]Y= {0,-1,0,1};
    static int result=0;
    static int a;
    static int b;
    static void o(int x,int y) {
        for(int i=0;i<4;i++) {
            int nx=x+X[i];
            int ny=y+Y[i];
            if(nx<0)nx=a-1;
            nx%=a;
            if(ny<0)ny=b-1;
            ny%=b;
            if(area.get(nx).contains(ny)&!visit.get(nx).contains(ny)) {
                visit.get(nx).add(ny);
                o(nx,ny);
            }
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        a = Integer.parseInt(stringTokenizer.nextToken());
        b = Integer.parseInt(stringTokenizer.nextToken());
        for(int i = 0; i < a; i++) {
            List<Integer> list = new ArrayList<>();
            stringTokenizer = new StringTokenizer(reader.readLine());
            for(int j = 0; j < b; j++) {
                if (Integer.parseInt(stringTokenizer.nextToken())<1) list.add(j);
            }
            area.add(list);
            visit.add(new ArrayList<>());
        }
        for(int i=0;i<a;i++) {
            for(int j:area.get(i)) {
                if(visit.get(i).contains(j))continue;
                visit.get(i).add(j);
                o(i,j);
                result++;
            }
        }
        System.out.println(result);
    }
}
