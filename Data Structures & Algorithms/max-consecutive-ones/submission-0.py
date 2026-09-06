class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        num = 0
        max_num = 0
        for i in nums: 
            if(i == 1):
                num = num +1
            else: 
                num = 0
            if(num > max_num):
                    max_num = num
        return max_num
            
        
