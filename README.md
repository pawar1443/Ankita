# Plus One - LeetCode (Easy)

## Problem Statement
You are given a **large integer** represented as an integer array `digits`, where each `digits[i]` is a single digit of the number.  
The digits are ordered from most significant to least significant (left to right).  
The task is to add **one** to this number and return the new array of digits.

---

## Example
**Input:**  
`digits = [1,2,3]`  

**Output:**  
`[1,2,4]`  

**Explanation:**  
The integer `123` + `1` = `124`.

---

## Constraints
- `1 <= digits.length <= 100`  
- `0 <= digits[i] <= 9`  
- No leading zeros in the input.

---

## Approach / Logic

1. **Start from the last digit (least significant).**  
   - If it’s less than `9`, just add 1 and we are done.  

2. **If the digit is `9`:**  
   - It becomes `0` because `9 + 1 = 10`.  
   - Carry `1` to the next digit on the left.  

3. **Repeat the process** until either:  
   - A digit less than `9` is found (carry stops), or  
   - All digits turn into `0`.  

4. **If all digits were `9`:**  
   - Example: `[9,9,9]` → after processing becomes `[0,0,0]` with a carry left.  
   - In this case, add `1` at the beginning → `[1,0,0,0]`.

---

## Example Walkthrough

### Input:  
`[9,9,9]`

### Step by Step:  
- Last digit `9` → becomes `0`, carry = 1  
- Second digit `9` → becomes `0`, carry = 1  
- Third digit `9` → becomes `0`, carry = 1  
- Carry left → add `1` at the front  

### Final Output:  
`[1,0,0,0]`

---

## Complexity
- **Time Complexity:** O(n) → in the worst case, we check each digit once.  
- **Space Complexity:** O(1) → only extra space needed if we insert `1` at the beginning.  

---
