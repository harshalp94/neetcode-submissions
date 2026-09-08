class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> dupMap = new HashMap();
        if (nums.length == 0)
            return false;
        for (int i = 0; i < nums.length; i++) {
            if (dupMap.containsKey(nums[i])) {
                return true;
            } else {
                dupMap.put(nums[i], i);
            }
        }
        return false;
    }
}