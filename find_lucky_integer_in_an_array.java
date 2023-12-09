class Solution {
    public int findLucky(int[] arr) {
        int c[] = new int[501];
        for(int i:arr){
            c[i]++;
        }
        for(int i=500;i>0;i--){
            if(i == c[i]){
                return i;
            }
        }
        return -1;
    }
}