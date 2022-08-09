package Programmers.Data_Structure;
import java.util.*;
import java.util.stream.Collectors;
public class P42587 {
	static public int solution(int[]p, int x) {
		//		List<Integer>l=Arrays.stream(p).boxed().collect(Collectors.toList());
		//		System.out.println(l);
		int r=0,a[]=p.clone(),i=0,j=0,l=p.length;
		Arrays.sort(a);
		for(;j<p.length&r<1;i++) {
			if(p[i%l]>0)
				if(p[i%l]==a[j]) {
					p[i%l]=-1;
					j++;
					if(i%l==x)r++;
				}
		}
		return j;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(new int[] {2,1,3,2},1);
	}

}
