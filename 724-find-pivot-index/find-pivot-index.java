class Solution {
    public int pivotIndex(int[] nums) {
        int prefSum=0;
        int suffSum=0;
        int Sum=0;
        for(int i=0;i<nums.length;i++){
            Sum=Sum+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(i>0){
            prefSum=prefSum+nums[i-1];
            }
            suffSum=Sum-prefSum-nums[i];
            if(prefSum==suffSum)
            return i;

        }
        return -1;
    }
}