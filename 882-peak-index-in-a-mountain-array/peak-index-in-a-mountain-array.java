class Solution {
    public int peakIndexInMountainArray(int[] arr) {
   int low=0;
   int high=arr.length-1;
   int res=-1;
   while(low<high){
    int mid=(high+low)/2;
    if(arr[mid]<arr[mid+1]){
        low=mid+1;
    }
    else if(arr[mid]<arr[mid-1]){
        high=mid;
    }
    else{
        res=mid;
           break;

    }
   }
   return res;    
}
}