class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]>list=new ArrayList<>();
        ArrayList<int[]>merged=new ArrayList<>();
        int start =newInterval[0];
        int end=newInterval[1];
        boolean insert=false;
        for(int i=0;i<intervals.length;i++){
         int   start1=intervals[i][0];
          int  end1=intervals[i][1];
            if(start1>=start && insert==false){
                list.add(newInterval);
                insert=true;
            }
            list.add(intervals[i]);
           
        }
         if(insert==false){
                list.add(newInterval);
            }
int v1=list.get(0)[0];
int v2=list.get(0)[1];
        for(int i=1;i<list.size();i++){
            int start2=list.get(i)[0];
            int end2=list.get(i)[1];
if(start2<=v2){
    v2=Math.max(v2,end2);
    continue;
}
merged.add(new int[]{v1,v2});
v1=start2;
v2=end2;
        }
        merged.add(new int[]{v1,v2});

     return merged.toArray(new int[merged.size()][]);
    }
}