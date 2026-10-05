class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        HashMap<Character,Integer>st=new HashMap<>();
        for(int i=0;i<n;i++){
            st.put(s.charAt(i), st.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<n;i++){
            if(st.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}