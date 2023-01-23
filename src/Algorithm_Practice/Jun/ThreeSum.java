package Algorithm_Practice.Jun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//�̸��� ����
public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>>r=new ArrayList();
//		�ߺ����� x
		int i=0,j,k,l=nums.length;
		for(;i<l-2;i++)
			for(j=i+1;j<l-1;j++)
				for(k=j+1;k<l;k++)
					if(nums[i]+nums[j]+nums[k]==0) {
						List list=Arrays.asList(nums[i],nums[j],nums[k]);
						Collections.sort(list);
						if(!r.contains(list))
							r.add(list);
					}
		
//		�ߺ����� o
//		Set<Integer>s=new HashSet(Arrays.asList(nums));
//		List<Integer>L=new ArrayList(s);
//		System.out.println(s.toString());
//		System.out.println(L.toString());
//		int l=s.size(),i=0,j,k;
//		for(;i<l-2;i++)
//			for(j=i+1;j<l-1;j++)
//				for(k=i+2;k<l;k++)
//					if(L.get(i)+L.get(j)+L.get(k)==0)
//						r.add(Arrays.asList(L.get(i),L.get(j),L.get(k)));
		return r;
	}
}
