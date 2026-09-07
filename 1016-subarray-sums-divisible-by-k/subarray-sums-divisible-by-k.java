class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum=0;
        int res=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            int val=sum % k;
            if(val<0){
                val=val+k;
            }
            map.getOrDefault(val,0);
           res=res+ map.getOrDefault(val,0);
           map.put(val,map.getOrDefault(val,0)+1);

        }
        return res;
    }
}