class Python_Solution:
    def maxValue(self, arr):
        if len(arr)==1:
            return arr[0]
        return max(self.maxLinear(arr, 0,len(arr)-2), self.maxLinear(arr, 1, len(arr)-1))
    
    def maxLinear(self, arr, start, end):
        prev1,prev2=0,0
        for i in range(start, end+1):
            temp = prev1
            prev1 = max(prev1, prev2+arr[i])
            prev2 = temp
        return prev1
