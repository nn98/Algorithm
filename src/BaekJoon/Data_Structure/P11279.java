package BaekJoon.Data_Structure;
import java.io.*;
import java.util.*;
public class P11279 {
    public static void main(String[]z)throws Exception{
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(r.readLine()),m;
        PriorityQueue<Integer>q=new PriorityQueue<>((a, b) -> b - a);
        for(;n-->0;) {
            m=Integer.parseInt(r.readLine());
            if(m==0)w.write((q.isEmpty()?0:q.poll())+"\n");
            else q.add(m);
        }
        w.flush();
    }
}