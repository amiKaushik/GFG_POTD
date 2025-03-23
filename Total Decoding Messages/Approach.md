# 📜 Total Decoding Messages  

## 🏆 Problem Statement  
A secret message is encoded using numbers, where each number corresponds to a letter in the alphabet:  

'A' -> 1
'B' -> 2
...
'Z' -> 26


Given a string of digits, determine the **total number of ways** it can be decoded into valid messages. However, there are certain constraints:  

- The digits must be decoded in a meaningful way.  
- A digit **'0'** cannot be mapped alone (e.g., `"05"` is invalid).  
- A two-digit number is only valid if it falls between `10-26`.  

---

## 🌟 Understanding the Problem with Examples  

### Example 1:
**Input:** `"123"`  
**Output:** `3`  
**Explanation:**  
The number `"123"` can be decoded in three ways:  
1. `"ABC"` (1 → A, 2 → B, 3 → C)  
2. `"LC"` (12 → L, 3 → C)  
3. `"AW"` (1 → A, 23 → W)  

### Example 2:
**Input:** `"90"`  
**Output:** `0`  
**Explanation:**  
- `"90"` cannot be decoded because `90` does not correspond to any letter.  

### Example 3:
**Input:** `"05"`  
**Output:** `0`  
**Explanation:**  
- `"05"` is invalid because no letter corresponds to `0`, and leading zeroes are not allowed.  

---

## 🛠 How to Approach the Problem?  

1. **Identify Valid Decodings:**  
   - Each digit alone (`1-9`) can represent a letter.  
   - Some two-digit numbers (`10-26`) form valid letters too.  
   - Ensure the string does not contain invalid numbers like `"0"` or `"30"`.  

2. **Break the Problem into Subproblems:**  
   - Find the total decodings for smaller sections of the string.  
   - Build up the solution step by step.  

3. **Think About Edge Cases:**  
   - Strings containing zeros (`"100"`, `"07"`, `"30"`) may not have valid decodings.  
   - Very short strings (`"1"`, `"10"`) have limited decoding options.  

---

## 🚀 Key Insights  

- **Single-digit numbers** are always valid unless they are `'0'`.  
- **Two-digit numbers** are valid only if they are between `10-26`.  
- The problem can be solved **efficiently** using a systematic approach rather than brute force.  

---

## 🎯 Conclusion  

- ✅ This problem is similar to decoding an encrypted message.  
- ✅ It requires **careful handling of zeros and two-digit numbers**.  
- ✅ The approach involves **breaking the problem down** and **building solutions step-by-step**.  

📌 **Tip:** If you’ve understood how we break the problem down, you can now try implementing the solution using **Dynamic Programming**! 🚀  
