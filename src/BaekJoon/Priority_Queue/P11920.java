package BaekJoon.Priority_Queue;

import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P11920 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(tokenizer.nextToken());
        int K = Integer.parseInt(tokenizer.nextToken());

        tokenizer = new StringTokenizer(reader.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            int V = Integer.parseInt(tokenizer.nextToken());
            queue.offer(V);
            if (i >= K) {
                writer.write(queue.poll() + " ");
            }
        }
        while (queue.isEmpty()) {
            writer.write(queue.poll() + " ");
        }
        writer.flush();
    }
}
