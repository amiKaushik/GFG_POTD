# Matrix Chain Multiplication

## Problem Statement
Matrix Chain Multiplication is an optimization problem where we need to find the most efficient way to multiply a given sequence of matrices. The order in which the matrices are multiplied affects the total number of scalar multiplications needed. The goal is to minimize this cost.

### 1️⃣ Understanding Matrix Multiplication
When multiplying two matrices **A (p × q)** and **B (q × r)**, the number of scalar multiplications required is:

```
p × q × r
```

Since matrix multiplication is **associative**, the order in which we multiply the matrices can significantly impact computational efficiency.

### 2️⃣ Example Problem
Given an array representing matrix dimensions:

```
arr = [2, 1, 3, 4]
```

This represents three matrices:
- `M1` with dimensions `2 × 1`
- `M2` with dimensions `1 × 3`
- `M3` with dimensions `3 × 4`

There are two ways to multiply these matrices:
1. `((M1 × M2) × M3)`: Cost = `(2 × 1 × 3) + (2 × 3 × 4) = 30`
2. `(M1 × (M2 × M3))`: Cost = `(1 × 3 × 4) + (2 × 1 × 4) = 20`

The minimum cost is **20**.

---

## 3️⃣ Approach and Solution

### **Dynamic Programming Approach**
1. **Define the subproblem:**
   - Let `dp[i][j]` represent the minimum cost to multiply matrices from index `i` to `j`.

2. **Recursive Relation:**
   - To determine `dp[i][j]`, iterate over possible partition points `k`:
     
     ```
     dp[i][j] = min(dp[i][k] + dp[k+1][j] + arr[i-1] * arr[k] * arr[j])
     ```
     where `k` varies from `i` to `j-1`.

3. **Base Case:**
   - A single matrix does not require any multiplication, so `dp[i][i] = 0`.

### 4️⃣ **Time Complexity**
- The dynamic programming solution runs in **O(N³)** time due to the three nested loops.

### 5️⃣ **Space Complexity**
- **O(N²)** due to the 2D `dp` table.

---

## Conclusion
- ✅ **Dynamic Programming** provides an optimal solution in **O(N³)** time.
- ✅ This approach significantly reduces redundant calculations compared to the recursive solution.
- ✅ Used in applications like **compiler optimizations**, **parallel computing**, and **graphics processing**.

---
📌 **Note:** This README provides a conceptual explanation of **Matrix Chain Multiplication**. For the actual code implementation, refer to the Java or Python solutions in this repository. 🚀

