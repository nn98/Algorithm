package BaekJoon;
import java.util.HashMap;
import java.util.Scanner;
public class P9375 {
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int num = s.nextInt();
		for (int i = 0; i < num; i++){
			int N = s.nextInt();
			HashMap<String, Integer> hm=new HashMap<>();
			for (int j=0;j<N;j++){
				String s1=s.next();
				String s2=s.next();
				if (hm.containsKey(s2)) {
					int idx = hm.get(s2);
					hm.put(s2, idx + 1);
				} else {
					hm.put(s2, 1);
				}
			}
			int result = 1;
			for (int val : hm.values()) {
				result *= val+1;
			}
			System.out.println(result - 1);
		}
	}
}