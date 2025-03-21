class Python_Solution:  
    def findMaxSum(self,arr):
        if not arr:
            return 0
        if len(arr)==1:
            return arr[0]
            
        prev2, prev1 = 0, arr[0]
        for i in range(1, len(arr)):
            curr = max(prev1, arr[i]+prev2)
            prev2, prev1 = prev1, curr
            
        return prev1
