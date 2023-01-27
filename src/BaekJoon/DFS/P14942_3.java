package BaekJoon.DFS;
// 고급알고리즘을 이애하기엔 부족하지만 때려맞추기만은 할수있다

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class P14942_3 {
    static class Connect {
        int target;
        int value;

        Connect(int target, int value) {
            this.target = target;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Connect{" +
                    "target=" + target +
                    ", value=" + value +
                    '}';
        }
    }

    static int number, power[], i, from, to, length, history[],result[];
    static List<Connect>[] cave;

    static void o(int x,int p,List<Connect> c) {
//        System.out.println(x+" "+p+" "+c);
        history[x]=1;
        if(p<=power[x])result[x]=1;
        else{
//            System.out.println("도달불가");
            int P=p;
            int i=0;
            for(;P>power[x];){
//                System.out.println("- "+c.get(i).value);
                P-=c.get(i).value;
                i++;
//                System.out.println("index: "+i);
            }
            result[x]=c.get(i-1).target;
        }
        for(Connect C:cave[x]){
            if(history[C.target]<1){
                int s=c.size();
                c.add(s,C);
                o(C.target,p+C.value,c);
                c.remove(s);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        number = Integer.parseInt(reader.readLine()) + 1;
        history = new int[number];
        result = new int[number];
        power = new int[number];
        cave = new List[number];
        for (i = 0; ++i < number; power[i] = Integer.parseInt(reader.readLine()), cave[i] = new ArrayList<>()) ;
        for (i = 1; ++i < number; ) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            from = Integer.parseInt(st.nextToken());
            to = Integer.parseInt(st.nextToken());
            length = Integer.parseInt(st.nextToken());
            cave[from].add(new Connect(to, length));
            cave[to].add(new Connect(from, length));
        }

//        writer.write(Arrays.toString(power)+"\n");
//        for(List l:cave)writer.write(l.toString()+"\n");
//        for(i=0;++i<number;){
//            history = new int[number];
//            o(i,0,0);
//            writer.write(result+"\n");
//        }
        o(1,0,new ArrayList<Connect>());
//        System.out.println(Arrays.toString(result));
        for(i=0;++i<number; writer.write(result[i]+"\n"));
        writer.flush();
    }
}
/* TestCase
13
19
23
25
34
13
19
23
25
34
13
19
23
30
1 2 10
1 3 10
1 4 10
2 5 10
2 6 10
3 7 10
4 8 10
4 9 10
4 10 10
6 11 10
8 12 10
10 13 10
 */