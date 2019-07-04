package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P10815_3{
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int i, n = Integer.parseInt(in.readLine()), d[] = new int[n];
		
		StringTokenizer s = new StringTokenizer(in.readLine().trim());
		for(i=0;i<n;i++) d[i] = Integer.parseInt(s.nextToken());
		
		Arrays.sort(d);
		
		int m = Integer.parseInt(in.readLine());
		s = new StringTokenizer(in.readLine().trim());
		for(i=0;i<m;i++) out.write((binarySearch(d, Integer.parseInt(s.nextToken()))+" "));
		out.close();
	}
	public static int binarySearch(int arr[], int key) {
		int front = 0, mid, rear = arr.length - 1;
		while (true) {
			mid = (front + rear) / 2;
			if (arr[mid] == key || arr[front] == key || arr[rear] == key) return 1;
			if (arr[mid] < key) front = mid + 1;
			else rear = mid - 1;
			if (rear <= front) return 0;
		}
	}
}