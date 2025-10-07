package Coding_Test.Kakao.Test_2024;
import java.util.*;

class Solution {
	public int solution(String[] friends, String[] gifts) {
		int answer = 0;
		int n = friends.length;
		HashMap<String, Integer> indexs = new HashMap<>();
		for(int i=0;i<n;i++) {
			indexs.put(friends[i], i);
		}
		int[][] history = new int[n][n];
		int[] giftCount = new int[n];
		int[] reciveCount = new int[n];
		for(String gift:gifts) {
			String[] sp = gift.split(" ");
			String from = sp[0];
			int fromIdx = indexs.get(from);
			String to = sp[1];
			int toIdx = indexs.get(to);
			history[toIdx][fromIdx] += 1;
			giftCount[fromIdx] += 1;
			reciveCount[toIdx] += 1;
		}
		// for(int[] a:history) System.out.println(Arrays.toString(a));
		// System.out.println("\n"+Arrays.toString(giftCount));
		// System.out.println("\n"+Arrays.toString(reciveCount)+"\n");
		int[] will = new int[n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) continue;
				if(history[i][j] >= 0) {
					if(history[i][j] > history[j][i]) {
						will[j] += 1;
					} else if (history[i][j] < history[j][i]) {
						will[i] += 1;
					} else if (history[i][j] == history[j][i]) {
						int iSum = giftCount[i] - reciveCount[i];
						int jSum = giftCount[j] - reciveCount[j];
						if(iSum < jSum) {
							will[j] += 1;
						} else if(jSum < iSum) {
							will[i] += 1;
						}
					}
					// System.out.println(String.format("i: %d / j: %d / %s", i, j, Arrays.toString(will)));
					history[i][j] = history[j][i] = -1;
				}
			}
		}
		// System.out.println(Arrays.toString(will));
		return Arrays.stream(will).max().orElseThrow();
	}
}
public class P01 {
}
