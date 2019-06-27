package BaekJoon;

import java.util.HashMap;
import java.util.Scanner;

public class P11652 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		HashMap m=new HashMap<Long,Integer>();
		for(int i=0;i<N;i++) {
			long v=s.nextLong();
			int input=1;
			if(m.containsKey(v)) input=(int) m.get(v)+1;
			m.put(v, input);
		}
		Object[] keys=m.keySet().toArray();
		Object[] values=m.values().toArray();
		int v=(int) values[0];
		long r=(long)keys[0];
		for(int i=1;i<m.size();i++) {
			if((int)values[i]==v) r=r<(long)keys[i]?r:(long)keys[i];
			if((int)values[i]>v) r=(long)keys[i];
		}
		System.out.println(r);
	}
}