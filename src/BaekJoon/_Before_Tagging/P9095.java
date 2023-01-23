package BaekJoon._Before_Tagging;

import java.util.Scanner;

public class P9095 {

	// �ǿܷ� ����
	// ����� Ǯ���
	public static void main(String[] args) {
		int[] arr = new int[11];
		int T, n;
		Scanner scanner = new Scanner(System.in);

		arr[0] = 0; // ������ 0�� �� ���(���)�� ��
		arr[1] = 1; // ������ 1�� �� ����� ��, 1 => 1��
		arr[2] = 2; // ������ 2�� �� ����� ��, 1+1, 2 => 2��
		arr[3] = 4; // ������ 3�� �� ����� ��, 1+1+1, 1+2, 2+1, 3 => 4��
		T = scanner.nextInt();
		for(int i = 0; i < T; i++) {
			n = scanner.nextInt();
			for(int j = 4; j <= n; j++){
				arr[j] = arr[j-1] + arr[j-2] + arr[j-3];
			}
			System.out.println(arr[n]);
		}
		scanner.close();

	}

}
