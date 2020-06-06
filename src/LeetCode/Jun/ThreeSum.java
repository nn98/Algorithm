package LeetCode.Jun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//이름봐 ㅅㅂ
public class ThreeSum {
	public static List<List<Integer>> threeSum(Integer[] nums) {
		List<List<Integer>>r=new ArrayList();
//		중복제거 x
//		int i=0,j,k,l=nums.length;
//		for(;i<l-2;i++)
//			for(j=i+1;j<l-1;j++)
//				for(k=j+1;k<l;k++)
//					if(nums[i]+nums[j]+nums[k]==0)
//						r.add(Arrays.asList(nums[i],nums[j],nums[k]));
		Set<Integer>s=new HashSet(Arrays.asList(nums));
		List<Integer>L=new ArrayList(s);
		System.out.println(s.toString());
		System.out.println(L.toString());
		int l=s.size(),i=0,j,k;
		for(;i<l-2;i++)
			for(j=i+1;j<l-1;j++)
				for(k=i+2;k<l;k++)
					if(L.get(i)+L.get(j)+L.get(k)==0)
						r.add(Arrays.asList(L.get(i),L.get(j),L.get(k)));
		return r;
	}
}
