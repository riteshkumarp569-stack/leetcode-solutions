class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
          if(nums[mid]==target){
            return mid;
          }
            if(nums[mid]>nums[nums.length-1]){   //1st part
       if(nums[mid]<target){
        low=mid+1;
        continue;
       }else{
        if(target>=nums[0]){
            high=mid-1;
            continue;
        }else{
            low=mid+1;
            continue;
        }
       }
            }
            else {    //2nd part
if(nums[mid]>target){
    high=mid-1;
    continue;
}else{
    if(target<=nums[nums.length-1]){
        low=mid+1;
            continue;

    }else{
        high=mid-1;
            continue;

    }
}
            }    
        }
        return -1;
    }
}