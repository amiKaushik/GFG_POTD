class Java_Solution {
    public int findMaxSum(int arr[]) {
        // code here
        if (arr.length == 0) return 0;
        if (arr.length == 1) return arr[0];

        int prev2 = 0, prev1 = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int curr = Math.max(prev1, arr[i] + prev2);
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}
