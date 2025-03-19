# Stock Buy and Sell – Max K Transactions Allowed  

## 1️⃣ Understanding the Problem Statement  

In this problem, you are given an array **prices[]** where `prices[i]` represents the stock price on day `i`. You are also given an integer `k`, which represents the maximum number of transactions allowed.  

Each **transaction** consists of:  
- Buying a stock  
- Selling the stock on a later day  

### Goal:  
Find the **maximum profit** achievable with at most `k` transactions.  

### Example Scenarios:  
#### **Example 1**  
**Input:**  
`prices = [10, 22, 5, 80], k = 2`  
**Output:** `87`  
**Explanation:**  
- Buy at `10`, sell at `22` → Profit = `12`  
- Buy at `5`, sell at `80` → Profit = `75`  
- **Total Profit = 12 + 75 = 87**  

#### **Example 2**  
**Input:**  
`prices = [20, 580, 420, 900], k = 3`  
**Output:** `1040`  
**Explanation:**  
- Buy at `20`, sell at `580` → Profit = `560`  
- Buy at `420`, sell at `900` → Profit = `480`  
- **Total Profit = 560 + 480 = 1040**  

#### **Example 3**  
**Input:**  
`prices = [100, 90, 80, 50, 25], k = 1`  
**Output:** `0`  
**Explanation:**  
- Stock price is continuously decreasing, meaning no profit can be made.  

---

## 2️⃣ Solution Approach  

### 🟢 **Dynamic Programming Approach**  
#### **Concept:**  
We use a **2D DP table**, `dp[k+1][n]`, where:  
- `dp[i][j]` represents the **maximum profit** achievable with **at most `i` transactions** on the first `j` days.  

#### **Transition Formula:**  
For each day `j` and for each transaction count `i`:  

dp[i][j] = max(dp[i][j-1], max(prices[j] - prices[m] + dp[i-1][m])  for all  m < j
 
- The first term represents **not selling on day `j`**.  
- The second term represents **selling on day `j` after buying on some earlier day `m`**.  

#### **Optimized DP Formula:**  
Using a helper variable `maxDiff`, we can optimize the second term:  
[
dp[i][j] = max(dp[i][j-1], prices[j] + maxDiff)
]  
where:  
maxDiff = max(maxDiff, dp[i-1][m] - prices[m])
 

---

## 3️⃣ Complexity Analysis  
- **Time Complexity:** `O(k * n)`, where `n` is the number of days and `k` is the max transactions.  
- **Space Complexity:** `O(k * n)`, can be optimized to `O(n)` using 1D DP arrays.  

---

## 4️⃣ Edge Cases to Consider  
- **Decreasing Prices:** If stock prices keep decreasing, profit should be `0`.  
- **k > n/2:** If transactions allowed exceed half the days, it behaves like an **unlimited transactions** problem.  
- **Small k Values:** The algorithm should efficiently handle small values of `k`.  

---

## 5️⃣ Conclusion  
- ✅ **Best Approach:** **Dynamic Programming (`O(k * n)`)** efficiently solves the problem.  
- ❌ **Greedy Approach:** Not applicable, as we must manage a limited number of transactions.  

📌 **Note:** This README explains the conceptual approach to solving the **Stock Buy and Sell – Max K Transactions Allowed** problem. 🚀  
