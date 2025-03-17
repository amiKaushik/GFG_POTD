# Subset Sum Problem – Dynamic Programming Approach  

## 📌 Problem Statement  
Given an array of **positive integers** `arr[]` and a **target sum**, determine **if there exists a subset** whose sum is equal to the given target sum.  

### 🔹 Example 1:  
```plaintext
Input: arr = [3, 34, 4, 12, 5, 2], sum = 9  
Output: true  
Explanation: A subset {4, 3, 2} sums to 9.
```
### 🔹 Example 2:  
```plaintext
Input: arr = [3, 34, 4, 12, 5, 2], sum = 30  
Output: false  
Explanation: No subset forms the sum 30.
```
### 🔹 Example 3:  
```plaintext
Input: arr = [1, 2, 3], sum = 6  
Output: true  
Explanation: The entire array {1, 2, 3} sums to 6.
```

---

## 🛠️ Approach – Dynamic Programming (Bottom-Up)  

### **🔹 Step 1: Define the DP Table**  
We create a **boolean DP table (`dp[i][j]`)**, where:  
- `i` represents the first `i` elements in `arr`.  
- `j` represents the target sum.  
- `dp[i][j]` is **true** if a subset with sum `j` can be formed using the first `i` elements.

### **🔹 Step 2: Transition Formula**  
- **If the current element is greater than `j`, we cannot include it**:  
  ```plaintext
  dp[i][j] = dp[i - 1][j]
  ```
- **Otherwise, we either include it or exclude it**:  
  ```plaintext
  dp[i][j] = dp[i - 1][j] OR dp[i - 1][j - arr[i - 1]]
  ```

### **🔹 Step 3: Base Case**  
- `dp[i][0] = true` → A subset sum of `0` is always possible (empty subset).  

---

## 🚀 Code Implementation (Java)  
   + **See Attached Soltuins[Java and Python]**
---

## ⏳ Complexity Analysis  
| Approach | Time Complexity | Space Complexity |
|----------|----------------|------------------|
| **Dynamic Programming (Bottom-Up)** | `O(n * sum)` | `O(n * sum)` (can be optimized to `O(sum)`) |

---

## 📌 Conclusion  
✅ **Best Approach:** **Dynamic Programming** (`O(n * sum)`)  
❌ **Recursive Approach:** Exponential (`O(2^n)`) – Not efficient for large inputs.  

🚀 **This solution efficiently determines whether a subset with the given sum exists!** 😃  
