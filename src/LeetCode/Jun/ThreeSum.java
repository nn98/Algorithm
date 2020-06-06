package LeetCode.Jun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//¿Ã∏ß∫¡ §µ§≤
public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>>r=new ArrayList();
		int i=0,j,k,l=nums.length;
		for(;i<l-2;i++)
			for(j=i+1;j<l-1;j++)
				for(k=j+1;k<l;k++)
					if(nums[i]+nums[j]+nums[k]==0)
						r.add(Arrays.asList(nums[i],nums[j],nums[k]));
		return r;
	}
}
