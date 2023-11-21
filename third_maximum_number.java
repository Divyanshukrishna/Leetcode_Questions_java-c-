class Solution {
    public int thirdMax(int[] nums) {
        int l=nums.length;
        Arrays.sort(nums);
        if(l < 2){
            return nums[l-1];
        }
        int c=1;
        for(int i=l-1;i>0;i--){
            if(nums[i] != nums[i-1]){
             c++;
        }
        if(c == 3){
            return nums[i-1];
        }else if(c > 3){
            break;
        }
        }
        return nums[l-1];
    }
}