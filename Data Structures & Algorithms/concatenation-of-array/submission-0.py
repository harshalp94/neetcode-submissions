class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        n = len(nums)
        
        ans: List[int] = [1] * (2*n)
        for i in range(n):
               ans[i] = nums[i]
               ans[n+i] = nums[i]
        return ans