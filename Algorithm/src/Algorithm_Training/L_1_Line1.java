package Algorithm_Training;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class L_1_Line1 {
	static Scanner s=new Scanner(System.in);
	static void sol1(int n,String[] word) {	//위치 신경쓰지 않은 압축. HashMap 사용해서 위치 고려 가능?
		//int n=3;
		//String[] word= {"AAAAAADDC","AADDKKJJLL","AJEKAL"};
		for(int i=0;i<n;i++) {
			String[] w=word[i].split("");
			Map<String,Integer> m=new HashMap<String,Integer>();
			//String[] w=word[i].split("");
			for(int j=0;j<w.length;j++) {
				//System.out.println(m.containsKey(w[j])+""+m.get(w[j]));
				//기존 메소드는 m.put(w[j],m.get(w[j]+1);
				//--> 결과값이 null. 
				// = Integer가 아닌 Object 반환해서?
				if(m.containsKey(w[j]))  {
					int v=m.get(w[j])+1;
					m.put(w[j], v);
				}
				else m.put(w[j], 1);
			}
			for(String j:m.keySet()) {
				System.out.print(m.get(j)+j);
			}
			System.out.println();
		}
	}
	static void sol2(int n,String[] word) {	//위치 고려하지 않은 압축. CountingSort방식

		for(int i=0;i<n;i++) {
			int[] alp=new int[26];
			char[] w=word[i].toCharArray();
			for(char c:w) alp[(int)c-(int)'A']++;
			for(int j=0;j<alp.length;j++) {
				if(alp[j]!=0) System.out.print(""+alp[j]+(char)(j+65));
			}
			System.out.println();
		}

	}
	static void sol3(int n,String[] word) {	//위치 고려한 압축. CountingSort방식
		for(int i=0;i<n;i++) {
			int[] alp=new int[26];
			char[] w=word[i].toCharArray();
			for(int j=0;j<w.length;j++) {
				alp[(int)w[j]-65]++;
				if(j==w.length-1) System.out.print(""+alp[(int)w[j]-65]+w[j]);
				else if(w[j]!=w[j+1]) {
					System.out.print(""+alp[(int)w[j]-65]+w[j]);
					alp[(int)w[j]-65]=0;
				}
			}
			System.out.println();
		}
	}
	public static void convert(String s) {
		char prev = 0; // 현재 문자
		int count = 0; // 현재 문자가 반복된 수
		for (int i = 0; i < s.length(); ++i) {
			char c = s.charAt(i);
			if (c == prev) // 동일한 문자를 만나면 count 증가
				++count;
			else { // 새 문자를 만나면, 기존의 문자와 count 출력
				if (count > 0)
					System.out.printf("%d%c", count, prev);
				prev = c; // 문자와 count 초기화
				count = 1;
			}
		}
		//마지막 출력에 \n빠짐
		System.out.printf("%d%c\n", count, prev); // 마지막 문자 출력
	}
	public static String toRLE(String s) {
		StringBuilder builder = new StringBuilder();
		char prev = 0; // 현재 문자
		int count = 0; // 현재 문자가 반복된 수
		for (int i = 0; i < s.length(); ++i) {
			char c = s.charAt(i);
			if (c == prev) // 동일한 문자를 만나면 count 증가
				++count;
			else { // 새 문자를 만나면, 기존의 문자와 count 출력
				if (count > 0)
					builder.append(count).append(prev);
				prev = c; // 문자와 count 초기화
				count = 1;
			}
		}
		builder.append(count).append(prev); // 마지막 문자 출력
		return builder.toString();
	}

	public static void main(String[] args) {
		int n=s.nextInt();
		String[] w=new String[n];
		for(int i=0;i<n;i++) w[i]=s.next();
		System.out.println("\nsol 1-");
		sol1(n,w);
		System.out.println("\nsol 2-");
		sol2(n,w);
		System.out.println("\nsol 3-");
		sol3(n,w);
		System.out.println("\nans 1-");
		for(String i:w) convert(i);
		System.out.println("\nans 2-");
		for(String i:w) System.out.println(toRLE(i));
	}

}
