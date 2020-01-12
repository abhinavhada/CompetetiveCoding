class Solution {
    public int maxSubArray(int[] nums) {
        int max_sol=nums[0], max_end=0;
        for(int i=0; i<nums.length; i++)
        {
            max_end+=nums[i];

            if(max_end>max_sol)
                max_sol=max_end;
            if(max_end<0)
                max_end=0;
        }
        return max_sol;
    }
}
