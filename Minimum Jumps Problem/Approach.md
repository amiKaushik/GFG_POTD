# 🚀 Minimum Jumps to Reach the End

## 1️⃣ Problem Statement  

You are given an array `arr[]` of **non-negative integers**. Each element represents the **maximum number of steps** you can jump forward from that position.  
The goal is to **find the minimum number of jumps** required to reach the last index.  

🔹 **Note:** If it is not possible to reach the end, return `-1`.  

---

## 2️⃣ Example Walkthrough  

### ✅ Example 1  
**Input:**  
```
arr = [1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9]
```
**Output:**
```
3
```
**Process:**

   + Jump from arr[0] = 1 → arr[1]
   + Jump from arr[1] = 3 → arr[4]
   + Jump from arr[4] = 9 → last index.



### ✅ Example 2
**Input:**
```
arr = [1, 4, 3, 2, 6, 7]
```
Output:
```
2
```
### ❌ Example 3 (Edge Case)
**Input:**
```
arr = [0, 10, 20]
```
Output:
```
-1
```

**Explanation:**
   + Since arr[0] = 0, we cannot move anywhere.

## 3️⃣ Solution Approach
### 🔵 Greedy Algorithm - O(N) Approach
We use a **Greedy approach** to minimize jumps while ensuring maximum reach.

**Algorithm Steps:**
1. Start at index `0` and initialize:

   + `jumps = 0` (tracks the number of jumps).
   + `maxReach = arr[0]` (maximum index we can reach).
   + `currentEnd = arr[0]` (end of the current jump range).
2. Iterate through the array:

   + If we reach `currentEnd`, we must jump to continue.
   + Update `maxReach` as the farthest position reachable.
   + If at any point, `maxReach `is greater than or equal to the last index, return the jump count.
   + If we ever reach a dead-end (`maxReach ≤ i`), return `-1`.
3. Time Complexity: `O(N)`

4. Space Complexity: `O(1)` (Only a few variables are used).

## 4️⃣ Code Implementation
**See Attached Solutions (Java and Python)**
## 5️⃣ Edge Cases Considered
+ ✅ Single Element Array: Already at last index → `0 jumps`.
+ ✅ All Zeros: No movement possible → `-1`.
+ ✅ First Element is Zero: No movement possible → `-1`.
+ ✅ Large Arrays: Algorithm runs efficiently in `O(N)`.

## 6️⃣ Conclusion
✅ Greedy Algorithm (`O(N)`) ensures the minimum jumps efficiently.
❌ Dynamic Programming (`O(N²)`) can work but is slower for large inputs.
❌ Recursive Approach (`O(2^N)`) is inefficient due to exponential growth.
📌 Note: This README explains the Minimum Jumps Problem conceptually with code implementation. If you're looking for more optimizations, explore Graph-based solutions. 🚀


--- 

Hope this helps! Happy Coding! 🎯🔥
