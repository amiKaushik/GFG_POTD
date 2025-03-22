# Stickler Thief II - House Robber 🏠🏃‍♂️‍➡️

## 1️⃣ Problem Statement  
A thief wants to loot houses arranged in a **circular** manner. Each house has some value associated with it, but he **cannot rob two adjacent houses**. Since the houses form a **circle**, the first and last houses are also considered adjacent. The goal is to determine the **maximum amount** the thief can steal.

---
## 2️⃣ Examples

### Example 1:
**Input:**  
`arr = [2, 3, 2]`  
**Output:**  
`3`  
**Explanation:**  
- The thief cannot rob both `arr[0]` and `arr[2]` since they are adjacent.
- The maximum he can steal is `3`.

### Example 2:
**Input:**  
`arr = [1, 2, 3, 1]`  
**Output:**  
`4`  
**Explanation:**  
- The best choice is `arr[0] + arr[2] = 1 + 3 = 4`.

### Example 3:
**Input:**  
`arr = [2, 2, 3, 1, 2]`  
**Output:**  
`5`  
**Explanation:**  
- The best choice is either `arr[0] + arr[2] = 2 + 3 = 5` or `arr[2] + arr[4] = 3 + 2 = 5`.

---
## 3️⃣ Approach and Solution

### **Dynamic Programming Approach**
1. Since the houses are in a **circular** arrangement, the first and last houses **cannot be robbed together**.
2. We break the problem into **two linear subproblems**:
   - Consider **excluding the last house** (rob from index `0` to `n-2`).
   - Consider **excluding the first house** (rob from index `1` to `n-1`).
3. Solve each subproblem using the **House Robber I algorithm**:
   - Define `dp[i] = max(dp[i-1], dp[i-2] + arr[i])`.
   - Use only **two variables** (`prev1` and `prev2`) to optimize space.
4. Take the **maximum of both cases** as the final answer.

### 4️⃣ **Time Complexity:**  
- `O(N)`, where `N` is the number of houses.

### 5️⃣ **Space Complexity:**  
- `O(1)`, since we only use a few extra variables.

---
## Conclusion
- ✅ **Optimal Approach:** Uses **Dynamic Programming** in `O(N)` time.
- ✅ **Optimized Space Complexity:** Uses `O(1)` extra space.
- ✅ **Handles Circular Constraint:** Ensures **first and last houses** are not robbed together.

This problem is a **variation of the House Robber Problem**, adapted to handle a circular arrangement of houses.

---
📌 **Note:** This README provides a conceptual explanation of **Stickler Thief II (House Robber II)**. For the actual code implementation, refer to the Java or Python solutions in this repository. 🚀

