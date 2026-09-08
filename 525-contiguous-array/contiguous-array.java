class Solution {
    public int findMaxLength(int[] nums) {
        int balance=0;
        int res=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                balance=balance+1;
            }else if(nums[i]==0){
                balance=balance-1;
            }
            if(map.containsKey(balance)==true){
                int val=i-map.get(balance);
                res=Math.max(res,val);
            }
            else{
                map.put(balance,i);
            }

        }
        return res;
    }
}