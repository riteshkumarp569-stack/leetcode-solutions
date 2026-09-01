class Solution {
    public int maximumSum(int[] arr) {
        int nodelet=arr[0];
        int ans=arr[0];
        int onedelet=Integer.MIN_VALUE;
        for(int i=1; i<arr.length;i++){
            int prevnodelet=nodelet;
        int prevonedelet=onedelet;
            int v1=nodelet+ arr[i];
            int v2=arr[i];
            nodelet=Math.max(v1,v2);
            int v3;
           if(prevonedelet == Integer.MIN_VALUE) {
    onedelet = prevnodelet;
} else {
    onedelet = Math.max(prevonedelet + arr[i], prevnodelet);
}
            
            ans=Math.max(ans,Math.max(nodelet,onedelet));
        }
        return ans;
    }
}