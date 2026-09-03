class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum=nums[0];
        int minSum=nums[0];
        int count=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            count=count+nums[i];
        }
        for(int i=1;i<nums.length;i++){
            maxSum=Math.max(maxSum+nums[i],nums[i]);
            minSum=Math.min(minSum+nums[i],nums[i]);
            if(minSum==count){
              ans=Math.max(ans,maxSum);
              continue;
            }
            ans=Math.max(ans,Math.max(maxSum,count-minSum));
        }
        return ans;
    }
}