package BaekJoon.DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P14942_2 {
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

    static int number, power[], i, from, to, length, result, history[];
    static List<Connect>[] cave;

    static void o(int x,int p,int r) {
//        System.out.println(i+" "+x+" "+p);
        history[x]=p;
        if(p<=power[i])r=x;
        if(x==1) {
            result=r;
            return;
        }
        for(Connect c:cave[x]){
            if(history[c.target]<1||history[c.target]>p+c.value){
                o(c.target,p+c.value,r);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        number = Integer.parseInt(reader.readLine()) + 1;
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
        for(i=0;++i<number;){
            history = new int[number];
            o(i,0,0);
            writer.write(result+"\n");
        }
        writer.flush();
    }
}
