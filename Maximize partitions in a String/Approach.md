# Maximize Partitions in a String 🚀

## Problem Statement 📜
Given a string `s` consisting of lowercase English letters, find the maximum number of substrings that can be formed such that no two substrings share a common character.

✅ The order of substrings **must be maintained**.
✅ Each substring should contain **unique characters**.

---

## Examples 🔢

### Example 1:
**Input:**  
`s = "acbbcc"`

**Output:**  
`2`

**Explanation:**  
Possible partition: `"a" | "cbbcc"`

---

### Example 2:
**Input:**  
`s = "ababcbacadefegdehijhklij"`

**Output:**  
`3`

**Explanation:**  
Partitioning at indices `8` and `15` produces three substrings: `"ababcbaca"`, `"defegde"`, and `"hijhklij"` such that none of them have a common character.

---

### Example 3:
**Input:**  
`s = "aaa"`

**Output:**  
`1`

**Explanation:**  
Since all characters are the same, no further partitions can be made.

---

## Approach and Solution 🧠
### **Greedy Approach**
1. Maintain a **set of characters** to track the unique characters in the current partition.
2. Iterate through the string:
   - If the current character is already in the set, **start a new partition**.
   - Otherwise, continue adding characters to the current partition.
3. Return the total number of partitions formed.

### **Time Complexity:**
- **O(N)**, where `N` is the length of `s` (we traverse the string once).

### **Space Complexity:**
- **O(1)**, since we store at most 26 characters in the set.

---

## Conclusion 🏆
- ✅ **Efficient greedy approach** with `O(N)` complexity.
- ✅ **Handles large constraints** (up to `10^5` characters).
- ✅ **Simple implementation with a hash set**.

🔥 **Common problem in string manipulation and partitioning!** 🚀

