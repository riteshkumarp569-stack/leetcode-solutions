class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
           char c=ransomNote.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);     
if(map.containsKey(ch)){
    map.put(ch,map.get(ch)-1);
    if(map.get(ch)==0){
           map.remove(ch);
        }
    }

        }
       if (map.size()==0){
        return true;
       }
      return false;
    }
}