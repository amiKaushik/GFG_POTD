# Maximize Partitions in a String 🚀

## Problem Statement 🐜
Given a string `s` of lowercase English alphabets, determine the **maximum number of substrings** that can be formed after partitioning `s` such that **no two substrings share a common character**.

👉 Each substring must have **unique** characters.  
👉 The goal is to maximize the number of partitions.

---

## Examples 💢

### Example 1:
**Input:**  
`s = "acbbcc"`  

**Output:**  
`2`  

**Explanation:**  
The string can be partitioned as `"a"` and `"cbbcc"`. Both substrings contain unique characters.

---

### Example 2:
**Input:**  
`s = "ababcbacadefegdehijhklij"`  

**Output:**  
`3`  

**Explanation:**  
Partitioning at the index `8` and `15` produces three substrings: `"ababcbaca"`, `"defegde"`, and `"hijhklij"`, ensuring no character repeats across partitions.

---

### Example 3:
**Input:**  
`s = "aaa"`  

**Output:**  
`1`  

**Explanation:**  
Since all characters are the same, we cannot partition further. The entire string is considered as a single substring.

---

## Approach and Solution 🧠
### **Greedy Approach using Last Occurrence Tracking**
1. **Store the last occurrence** of each character in a dictionary.
2. **Iterate through `s`**, tracking the farthest index that must be included in the current partition.
3. **Whenever the current index reaches the farthest index**, finalize a partition and start a new one.
4. **Count the number of partitions** and return the result.

### **Java Solution:**
```java
import java.util.HashMap;

class Java_Solution {
    public int maxPartitions(String s) {
        HashMap<Character, Integer> lastIndex = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lastIndex.put(s.charAt(i), i);
        }

        int partitions = 0;
        int maxReach = 0;
        int lastCut = -1;

        for (int i = 0; i < s.length(); i++) {
            maxReach = Math.max(maxReach, lastIndex.get(s.charAt(i)));
            if (i == maxReach) {
                partitions++;
                lastCut = i;
            }
        }

        return partitions;
    }
}
```

### **Python Solution:**
```python
def maxPartitions(s):
    last_index = {c: i for i, c in enumerate(s)}
    partitions, max_reach = 0, 0
    last_cut = -1
    
    for i, c in enumerate(s):
        max_reach = max(max_reach, last_index[c])
        if i == max_reach:
            partitions += 1
            last_cut = i
    
    return partitions
```

### **Time Complexity:**
- **O(N)**, where `N` is the length of `s` (single pass through the string and dictionary lookup is O(1)).

### **Space Complexity:**
- **O(1)**, as we store at most 26 characters' last indices.

---

## Conclusion 🏆
- 👉 **Greedy approach ensures optimal partitioning.**
- 👉 **Works efficiently for large inputs (`N ≤ 100000`).**
- 👉 **Common interview problem to test string manipulation skills.**

