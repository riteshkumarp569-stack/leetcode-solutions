class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int sum=0;
        boolean ans=false;
        for(Character c:map.keySet()){
if(map.get(c)%2==0){
    sum=sum+map.get(c);
}
else if(map.get(c)%2!=0){
    ans=true;
    sum=sum+(map.get(c)-1);
}
 }
        return ans==true? sum+1:sum;
    }
}