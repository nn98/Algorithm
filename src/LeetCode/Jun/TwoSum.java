package LeetCode.Jun;
public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
        int i=0,r[]=new int[2],j,l=nums.length;
        for(;i<l;i++){
            for(j=i+1;j<l;j++){
                if(nums[i]+nums[j]==target){
                    r[0]=i;
                    r[1]=j;
                    return r;
                }
            }
        }
        return r;
    }
}