class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int low=0;
        int high=0;
        int val=0;
        int mul=1;
        while(high<nums.length){
            mul=mul*nums[high];
            while(mul>=k && high>low){
                mul=mul/nums[low];
                low++;
            }
             if(mul<k){
                val+=high-low+1;
                
            }
            high++;
        }
        return val;
    }
}