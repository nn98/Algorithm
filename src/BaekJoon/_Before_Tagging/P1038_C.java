package BaekJoon._Before_Tagging;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//���Q�Q�ϳ� https://roseline124.github.io/algorithm/2019/04/16/Algorithm-baekjoon-1038.html

public class P1038_C {
	public static ArrayList getDownNumber(long num, int digit, ArrayList downNumList) {
			
		if(digit > 10) {
			return downNumList;
		}
		
		downNumList.add(num);
		
		for(int i=0; i<10; i++) {
			if(num%10 > i) {
				getDownNumber((num*10) + i, digit+1, downNumList);
			}
		}
		
		return downNumList;
	}
	
	public static void main(String[] args) {
		
		// �Է� �ޱ� 
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int idx = Integer.parseInt(input);
		
		// �����ϴ� �� ����Ʈ ����� 
		ArrayList<Integer> downNumList = new ArrayList<>();
		
		for(int num=0; num<10; num++) {
			 getDownNumber(num, 1, downNumList);
		}
		
		// ����
		Collections.sort(downNumList);
		
		if(idx >= 1023) {
			System.out.println(-1);
		}
		else {
			System.out.println(downNumList.get(idx));
		}
	}
}