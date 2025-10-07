package Coding_Test.Kakao.Test_2024;
import java.util.*;

public class P02 {
	static class Solution {
		public int[] solution(int[][] edges) {
			HashMap<Integer, Node> nodes = new HashMap<>();
			sol(edges, nodes);
			System.out.println(nodes.entrySet());
			int start = -1;
			int stick = 0;
			int eight = 0;
			for(Map.Entry<Integer, Node> nodeEntry : nodes.entrySet()) {
				Node node = nodeEntry.getValue();
				if(node.out == 0) stick += 1;
				else if(node.in == 0 && node.out >= 2) start = nodeEntry.getKey();
				else if(node.in >= 2 && node.out == 2) eight += 1;
			}
			int donut = nodes.get(start).out - stick - eight;
			int[] answer = {start, donut, stick, eight};
			return answer;
		}
		static void sol(int[][] edges, HashMap<Integer, Node> nodes) {
			for(int[] edge : edges) {
				int from = edge[0];
				int to = edge[1];
				Node inNode = nodes.get(to);
				if(inNode == null) inNode = new Node();
				inNode.in += 1;
				nodes.put(to, inNode);

				Node outNode = nodes.get(from);
				if(outNode == null) outNode = new Node();
				outNode.out += 1;
				nodes.put(from, outNode);
			}
		}
	}
	static class Node {
		int in;
		int out;
		Node() {
			this.in = 0;
			this.out = 0;
		}
		@Override
		public String toString() {
			return String.format("in : %d / out : %d", in, out);
		}
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(new Solution().solution(new int[][]{{2, 3}, {4, 3}, {1, 1}, {2, 1}})));
		System.out.println(Arrays.toString(new Solution().solution(new int[][]{{4, 11}, {1, 12}, {8, 3}, {12, 7}, {4, 2}, {7, 11}, {4, 8}, {9, 6}, {10, 11}, {6, 10}, {3, 5}, {11, 1}, {5, 3}, {11, 9}, {3, 8}})));
	}
}
