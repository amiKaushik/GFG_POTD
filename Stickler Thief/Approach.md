# 🏠 Stickler Thief – Maximum Loot Problem  

## 🔹 Problem Statement  

Stickler the thief wants to rob houses in a straight line, but **he cannot rob two consecutive houses**.  
His goal is to **maximize the total amount of money stolen**.  

You are given an array `arr[]`, where `arr[i]` represents the **money** in the `i-th` house.  
Find the **maximum amount he can loot** while following the **no two consecutive houses** rule.  

---

## 📝 Examples  

### ✅ Example 1  
**Input:**  
```
arr = [6, 5, 5, 7, 4]
```
**Output:**  
```
15
```
**Explanation:**  
The best way to loot is:  
- **Loot 1st house →** 6  
- **Skip 2nd house**  
- **Loot 3rd house →** 5  
- **Skip 4th house**  
- **Loot 5th house →** 4  

Total = `6 + 5 + 4 = 15`.  

---

### ✅ Example 2  
**Input:**  
```
arr = [1, 5, 3]
```
**Output:**  
```
5
```
**Explanation:**  
- The best option is to **loot only the 2nd house**, getting **5**.  

---

### ✅ Example 3  
**Input:**  
```
arr = [4, 4, 4, 4]
```
**Output:**  
```
8
```
**Explanation:**  
- The optimal choice is to loot **every alternate house**.  
  - **Loot 1st house →** 4  
  - **Skip 2nd house**  
  - **Loot 3rd house →** 4  

Total = `4 + 4 = 8`.  

---

## 🚀 Solution Approach  

### 🔹 **Dynamic Programming (Optimized)**  

**Key Idea:**  
At each house `i`, Stickler has two choices:  
1. **Skip the current house:** Stick with the **loot collected till the previous house** (`dp[i-1]`).  
2. **Loot the current house:** Add its money to the **loot collected till (i-2)th house** (`arr[i] + dp[i-2]`).  

Thus, the **recurrence relation** is:  

\[
dp[i] = \max(dp[i-1], arr[i] + dp[i-2])
\]

---

### 🔹 **Optimized Space Complexity (O(1) Solution)**  

Instead of using an array, we can store only **two variables**:  
- `prev1` → Stores the **maximum loot** till the previous house.  
- `prev2` → Stores the **maximum loot** till two houses before.  

For each house, update them as follows:  
```
current = max(prev1, arr[i] + prev2)
prev2 = prev1
prev1 = current
```
This reduces **space complexity to O(1)**.  

---

## ⏳ Complexity Analysis  

- **Time Complexity:** `O(N)` → We iterate through the array once.  
- **Space Complexity:** `O(1)` → We use only a few variables instead of an extra array.  

---

## 🔍 Edge Cases Considered  

✅ **Single house:** `arr = [10]` → Answer: `10`  
✅ **All houses with the same value:** `arr = [4, 4, 4, 4]` → Answer: `8`  
✅ **Large inputs:** Efficiently handles `arr.size() ≤ 10^5`.  

---

📌 **Note:** This README explains the **Stickler Thief Problem** using a **Dynamic Programming approach** to find the **maximum loot** efficiently. 🚀  
