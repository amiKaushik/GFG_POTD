# 0-1 Knapsack Problem – Approach Explanation

## 1️⃣ Understanding the Problem Statement  

The **0-1 Knapsack Problem** is a combinatorial optimization problem where:  
- You have a **knapsack** with a maximum **weight capacity (W)**.  
- You have **N items**, each with:  
  - A **weight (wᵢ)**  
  - A **value (vᵢ)**  
- The goal is to maximize the **total value** of selected items without exceeding the weight limit.  
- Each item can either be **included (1)** or **excluded (0)**—hence, "0-1" Knapsack.  

### Example:  
**Given:**  
- `W = 10` (Knapsack capacity)  
- `Items = [{weight: 5, value: 10}, {weight: 4, value: 40}, {weight: 6, value: 30}]`  

**Optimal Selection:**  
- Pick the item with weight `4` and value `40`.  
- Pick the item with weight `5` and value `10`.  
- **Total Value = 50** (since `4 + 5 ≤ 10`).  

---

## 2️⃣ Solution Approach (Concept-Based)  

### 🟢 **Method 1: Dynamic Programming (DP) - Bottom-Up Approach**  
#### **Concept:**  
- We create a **DP table `dp[i][w]`**, where:  
  - `i` represents the first `i` items considered.  
  - `w` represents the current weight capacity.  
  - `dp[i][w]` stores the **maximum value** achievable with these constraints.  

#### **Transition Formula:**  
For each item `i`:  
- **If we don't take the item:**  
  \[
  dp[i][w] = dp[i-1][w]
  \]  
- **If we take the item (only if its weight `wᵢ` ≤ `w`)**:  
  \[
  dp[i][w] = \max(dp[i-1][w], vᵢ + dp[i-1][w-wᵢ])
  \]  
- The final solution is found at `dp[N][W]`.  

#### **Time Complexity:** `O(N * W)`  
#### **Space Complexity:** `O(N * W)`, can be optimized to `O(W)`.  

---

### 🔵 **Method 2: Recursive Approach (Exponential Complexity)**  
#### **Concept:**  
We make a choice for each item:
1. **Exclude the item** → Solve for `knapsack(n-1, W)`.  
2. **Include the item** (if `wᵢ` ≤ `W`) → Solve for `vᵢ + knapsack(n-1, W - wᵢ)`.  
3. Return the **maximum value** of both choices.  

#### **Recursive Formula:**  
\[
knapsack(i, w) = \max(knapsack(i-1, w), vᵢ + knapsack(i-1, w-wᵢ))
\]  
- **Base Case:** If no items are left (`i == 0`) or `W == 0`, return `0`.  
- **Time Complexity:** `O(2^N)` (Exponential).  

---

### 🔴 **Method 3: Greedy Approach (Not applicable for 0-1 Knapsack)**  
- **Fractional Knapsack** (solved using Greedy) allows selecting fractional items, but **0-1 Knapsack requires whole items**, making DP the best approach.  

---

## 3️⃣ Conclusion  
- ✅ **Best Approach:** **Dynamic Programming (`O(N * W)`)** is efficient and widely used.  
- ❌ **Recursive Approach:** Simple but slow (`O(2^N)`).  
- ❌ **Greedy:** Works only for Fractional Knapsack.  

---

📌 **Note:** This README explains the conceptual approach to solving the **0-1 Knapsack Problem**. If you are looking for the implementation, check the code in this repository. 🚀  
