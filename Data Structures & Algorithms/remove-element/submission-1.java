class Solution {
    public int removeElement(int[] nums, int val) {
        int tmpPoint = 0, n = nums.length;
        while(tmpPoint < n) {
            if(nums[tmpPoint] == val) {
                nums[tmpPoint] = nums[--n];
            } else {
                tmpPoint++;
            }
        }
        return tmpPoint;
    }
}