# Boolean Parenthesization Problem

## Problem Statement
A boolean expression consists of **'T' (True), 'F' (False)** and the operators:
- `&` (AND)
- `|` (OR)
- `^` (XOR)

The goal is to determine the number of ways to **parenthesize** the given expression so that it evaluates to `True`.

---

## Examples

### Example 1:
**Input:**
```
s = "T|T&F^T"
```
**Output:**
```
4
```
**Explanation:**
The expression can be parenthesized in 4 ways to evaluate as `True`:
1. `((T|T)&(F^T))`
2. `(T|(T&(F^T)))`
3. `(((T|T)&F)^T)`
4. `(T|((T&F)^T))`

### Example 2:
**Input:**
```
s = "T^F|F"
```
**Output:**
```
2
```
**Explanation:**
The expression can be parenthesized in 2 ways to evaluate as `True`:
1. `((T^F)|F)`
2. `(T^(F|F))`

---

## Approach
### **Understanding the Problem**
Each boolean expression consists of **operands ('T', 'F')** and **operators ('&', '|', '^')**. The challenge is to find the number of ways to place parentheses such that the expression evaluates to `True`.

### **Dynamic Programming Approach**
1. **Define Subproblems:**
   - Let `T[i][j]` represent the number of ways the subexpression `s[i:j]` evaluates to `True`.
   - Let `F[i][j]` represent the number of ways it evaluates to `False`.

2. **Base Case:**
   - If `s[i]` is `T`, set `T[i][i] = 1`, otherwise `F[i][i] = 1`.

3. **Recursive Formula:**
   - Iterate over all possible **splits** of the expression.
   - Compute results for `&`, `|`, and `^` operators based on existing subproblem results.
   
4. **Final Answer:**
   - The result is stored in `T[0][n-1]`.

### **Time & Space Complexity**
- **Time Complexity:** `O(N^3)`, since we explore all partitions.
- **Space Complexity:** `O(N^2)`, since we store results in DP tables.

---

## Conclusion
- ✅ **Efficient Dynamic Programming solution** reduces redundant calculations.
- ✅ **Handles different boolean operators and large expressions.**
- ✅ **Optimized with `O(N^2)` space complexity.**

This problem is useful in **compiler design, logic circuit design, and AI reasoning systems**.

