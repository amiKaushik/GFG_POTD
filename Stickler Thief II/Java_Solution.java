

class Java_Solution {
    int maxValue(int[] arr) {
        int n = arr.length;
        if(n==1) return arr[0];
        return Math.max(maxLinear(arr, 0, n-2), maxLinear(arr, 1, n-1));
    }
    private int maxLinear(int[] arr, int start, int end){
        int prev1 =0,prev2=0;
        for(int i=start;i<=end;i++){
            int temp=prev1;
            prev1=Math.max(prev1, prev2+arr[i]);
            prev2=temp;
        }
        return prev1;
    }
}
