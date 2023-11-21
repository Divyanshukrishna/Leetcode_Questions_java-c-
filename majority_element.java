class Solution {
    public int majorityElement(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        int c=0;
        if(nums[len/2] == nums[len/2]){
            return nums[len/2];
        }
        return nums[len-2];
    }
}