# Gas Station Problem ⛽

## Problem Statement 📜
You are given a circular route with `N` gas stations. Each station has:
- `gas[i]`: The amount of gas available at station `i`.
- `cost[i]`: The cost of gas required to travel from station `i` to station `(i+1) % N`.

A car with an **unlimited tank** starts from a station with an **empty tank**. Find the **starting station index** if it's possible to complete the circuit **clockwise** without running out of gas. If it's not possible, return `-1`.

✅ A solution is **guaranteed to be unique** if one exists.

---

## Examples 🔢

### Example 1:
**Input:**  
`gas = [4, 5, 7, 4]`  
`cost = [6, 6, 3, 5]`  

**Output:**  
`2`

**Explanation:**  
Start from station `2`:  
- Gas at station 2: `(0 + 7) = 7`
- Travel to station 3: `(7 - 3 + 4) = 8`
- Travel to station 0: `(8 - 5 + 4) = 7`
- Travel to station 1: `(7 - 6 + 5) = 6`
- Travel to station 2: `(6 - 6) = 0` ✅

---

### Example 2:
**Input:**  
`gas = [1, 2, 3, 4, 5]`  
`cost = [3, 4, 5, 1, 2]`  

**Output:**  
`3`

**Explanation:**  
Start from station `3`:  
- Gas at station 3: `4`
- Travel to station 4: `4 - 1 + 5 = 8`
- Travel to station 0: `8 - 2 + 1 = 7`
- Travel to station 1: `7 - 3 + 2 = 6`
- Travel to station 2: `6 - 4 + 3 = 5`
- Travel to station 3: `5 - 5 = 0` ✅

---

### Example 3:
**Input:**  
`gas = [3, 9]`  
`cost = [7, 6]`  

**Output:**  
`-1`

**Explanation:**  
No station allows a full circuit.

---

## Approach and Solution 🧠
### **Greedy Algorithm Approach**
1. **Calculate net gas** at each station (`gas[i] - cost[i]`).
2. **Check if total gas is sufficient**:
   - If `sum(gas) < sum(cost)`, return `-1` (impossible to complete the circuit).
3. **Find the starting station**:
   - If at any station, the **current gas becomes negative**, reset the starting index.

### **Time Complexity:**  
- **O(N)** → We traverse the list only **once**.

### **Space Complexity:**  
- **O(1)** → We use only a few integer variables.

---

## Code Implementation 💻

### **Python Solution**
```python
class Python_Solution:
    def canTravel(self, gas, cost):
        total_gas, curr_gas = 0, 0
        start_index = 0
        
        for i in range(len(gas)):
            total_gas += gas[i] - cost[i]
            curr_gas += gas[i] - cost[i]
            
            if curr_gas < 0:
                start_index = i + 1
                curr_gas = 0
        
        return start_index if total_gas >= 0 else -1
```

### **Java Solution**
```java
class Java_Solution {
    public int canTravel(int[] gas, int[] cost) {
        int totalGas = 0, currGas = 0, startIndex = 0;
        
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i] - cost[i];
            currGas += gas[i] - cost[i];
            
            if (currGas < 0) {
                startIndex = i + 1;
                currGas = 0;
            }
        }
        
        return totalGas >= 0 ? startIndex : -1;
    }
}
```

---

## Conclusion 🏆
- ✅ **Efficient Greedy Algorithm** with `O(N)` complexity.
- ✅ **Handles large constraints** (up to 10^6 stations).
- ✅ **Guaranteed unique solution if one exists**.

🔥 **This problem is commonly asked in coding interviews at top tech companies!** 🚀
