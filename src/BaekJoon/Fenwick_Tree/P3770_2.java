package BaekJoon.Fenwick_Tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P3770_2 {
    static int[] tree;
    static class IO {
        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        static String readLine() throws Exception {
            return reader.readLine();
        }
        static void write(String line) throws Exception {
            writer.write(line);
        }
        static void flush(String line) throws Exception {
            writer.write(line);
        }
    }

    static int init() throws Exception {
        int caseCount = Integer.parseInt(IO.reader.readLine());
        for(int i=0;i<caseCount;i++) {
            solution();
        }
        return 0;
    }

    static void solution() throws Exception{
        StringTokenizer tokenizer=new StringTokenizer(IO.readLine());
        int n=Integer.parseInt(tokenizer.nextToken());
        int m=Integer.parseInt(tokenizer.nextToken());
        int k=Integer.parseInt(tokenizer.nextToken());
        tree=new int[n];
    }

    public static void main(String[] args) {

    }


}