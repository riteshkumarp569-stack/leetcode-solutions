class Solution {
    public int countCommas(int n) {
       int k=0;
        if(n<=999){
            return 0;
        }else{
             k=n-999;
        }
        return k;
    }
}