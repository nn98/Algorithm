package BaekJoon.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1117 {

	static long w, h, f, c;
	static long x1, x2, y1, y2;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] input = new int[8];

		for(int i = 0; i < 8; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}

		w = input[0];
		h = input[1];
		f = input[2];
		c = input[3] + 1;
		x1 = input[4];
		y1 = input[5];
		x2 = input[6];
		y2 = input[7];

		System.out.println(solution());
	}

	public static long solution() {
		long answer = 0;

		long total = w * h;
		// 접힌 영역의 w 길이
		long folded;

		// 접힌 면적 구하기
		if(f > w / 2) {
			folded = w - f;
		} else {
			folded = f;
		}

		// 접힌 면적이 x1 좌표보다 작을 때 (파란 부분만 칠해짐)
		if(folded <= x1) {
			answer = total - c * (x2 - x1) * (y2 - y1);
		}
		// 접힌 면적이 x1, x2 사이에 있을 때 (빨강, 파랑 모두 칠해짐)
		else if(folded < x2) {
			answer = total - 2 * c * (folded - x1) * (y2 - y1) - c * (x2 - folded) * (y2 - y1);
		}
		// 접힌 면적이 x2보다 작을 때 (빨간 부분만 고려)
		else {
			answer = total - c * 2 * (x2 - x1) * (y2 - y1);
		}

		return answer;
	}
}
