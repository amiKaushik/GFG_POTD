# Partition Equal Subset Sum – Approach Explanation  

## 1️⃣ Understanding the Problem Statement  

The **Partition Equal Subset Sum** problem asks whether we can split a given array into **two subsets** such that both subsets have the **same sum**.  

### Example:  
**Input:**  
`arr = [1, 5, 11, 5]`  
**Output:** `True`  
**Explanation:** The array can be split into `[1, 5, 5]` and `[11]`, both having sum `11`.  

**Input:**  
`arr = [1, 3, 5]`  
**Output:** `False`  
**Explanation:** No valid partition exists.  

---

## 2️⃣ Solution Approach  

### 🟢 **Dynamic Programming Approach (1D DP)**
#### **Concept:**  
- Find the **total sum** of the array.  
- If the **sum is odd**, partitioning is impossible.  
- If the **sum is even**, check whether there exists a subset with sum = `total_sum / 2`.  
- Use **Dynamic Programming (DP)** to track achievable subset sums.  

#### **Algorithm:**  
1. Compute the **total sum** of the array.  
2. If `total_sum` is **odd**, return `False` (not possible).  
3. Use **1D DP** to check if a subset with sum `total_sum / 2` exists.  
4. If `dp[total_sum / 2] == True`, return `True`; otherwise, return `False`.  

---

## 3️⃣ Complexity Analysis  
- **Time Complexity:** `O(N * S)`, where `N` is the number of elements and `S` is the target sum.  
- **Space Complexity:** `O(S)`, optimized using a 1D DP array.  

---

## 4️⃣ Conclusion  
- ✅ **Best Approach:** **Dynamic Programming (`O(N * S)`)** efficiently solves the problem.  
- ❌ **Recursive Approach:** Exponential time complexity, making it inefficient for large inputs.  

📌 **Note:** This README explains the conceptual approach to solving the **Partition Equal Subset Sum** problem. 🚀  

♦️ SEE **ATTACHED SOLUTION FILES [JAVA & PYTHON]**
