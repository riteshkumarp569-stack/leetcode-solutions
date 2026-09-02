class Solution {
    public int maxAbsoluteSum(int[] nums) {
       int minEnd=0;
       int maxEnd=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int v1=maxEnd+nums[i];
            int v2=nums[i];
            int v3=minEnd+nums[i];
             maxEnd=Math.max(Math.max(v1,v3),v2);
             minEnd=Math.min(Math.min(v1,v3),v2);
            ans=Math.max(ans,Math.max(Math.abs(maxEnd),Math.abs(minEnd)));
        }
        return ans;
    }
}