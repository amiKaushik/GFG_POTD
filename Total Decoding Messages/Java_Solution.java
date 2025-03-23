class Solution {
    public int countWays(String digits) {
        if(digits == null || digits.length() == 0 || digits.charAt(0) == '0')
            return 0;
        int n = digits.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = digits.charAt(0) != '0' ? 1:0;
        
        for(int i=2;i<=n;i++){
            int oneDigit = Integer.parseInt(digits.substring(i-1,i));
            int twoDigits = Integer.parseInt(digits.substring(i-2,i));
            if(oneDigit >= 1){
                dp[i] += dp[i-1];
            }
            if(twoDigits >= 10 && twoDigits<=26){
                dp[i]+=dp[i-2];
            }
        }
        return dp[n];
    }
}
