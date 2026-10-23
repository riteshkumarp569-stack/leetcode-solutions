class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int max=Integer.MAX_VALUE; 
        Arrays.sort(nums); 
        int Res_sum = nums[0] + nums[1] + nums[2];
        for(int i=0;i<nums.length-2;i++){ 
            int left=i+1;
             int right=nums.length-1;
              while(left<right){
                 int sum=nums[i]+nums[left]+nums[right];
                  int diff=Math.abs(sum-target);
                   if(sum==target){ 
                    return sum; 
                    } 
                    if(diff<max){ 
                        max=diff; Res_sum=sum; 
                        } 
                        if(sum<target){ 
                            left++; 
                            } 
                            else { 
                                right--; 
                                } 
                                }
                                 }
                                  
                                   return Res_sum; 
                                   }
                                    }
