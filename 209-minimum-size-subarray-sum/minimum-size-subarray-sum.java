class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0;
        int high=0;
        int minLen=Integer.MAX_VALUE;
         int sum=0;
        while(high<nums.length){
            sum=sum+nums[high];
while(sum>=target){
    int len=high-low+1;
   if(minLen>len){
    minLen=len;
   }
    sum=sum-nums[low];
    low++;

}
high++;
   
}
if(minLen==Integer.MAX_VALUE){
    return 0;
}
return minLen;

        
            }
}
