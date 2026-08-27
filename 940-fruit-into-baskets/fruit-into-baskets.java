class Solution {
    public int totalFruit(int[] fruits) {
        HashMap< Integer,Integer> map = new HashMap<>();
        int low=0;
        int high=0;
        int k=2;
        int maxLen=0;
        for(high=0;high<fruits.length;high++){
            int num= fruits[high];
            map.put(num,map.getOrDefault(num,0)+1);
            while(map.size()>k){
                int num2=fruits[low];
                map.put(num2,map.get(num2)-1);
                if(map.get(num2)==0){
                    map.remove(num2);
                }
                low++;
            }
            if(map.size()<=k){
                  int  count = high-low+1;
                 maxLen=Math.max(count,maxLen);
            }

              
        }
        return maxLen;
    }
}