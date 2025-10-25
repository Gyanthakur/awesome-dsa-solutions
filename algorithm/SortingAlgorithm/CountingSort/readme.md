# 🧮 Counting Sort Algorithm

## 📘 Overview
Counting Sort is a non-comparison-based sorting algorithm used for sorting integers or categorical data.  
It works by counting the number of occurrences of each unique element and using that count to determine the element's position in the sorted array.

---

## ⚙️ How It Works
1. Find the maximum value in the array.
2. Create a count array of size `max + 1`.
3. Count occurrences of each element.
4. Modify the count array so each index stores the sum of previous counts.
5. Build the output array using the count array to place elements in correct order.

---

## 📊 Time & Space Complexity

| Case | Time Complexity | Space Complexity |
|------|------------------|------------------|
| Best | O(n + k) | O(k) |
| Average | O(n + k) | O(k) |
| Worst | O(n + k) | O(k) |

Where:
- `n` = number of elements  
- `k` = range of input (max value in array)

---

## ✅ Example
**Input:**  
`[4, 2, 2, 8, 3, 3, 1]`

**Count array (after counting):**  
`[0, 1, 2, 0, 1, 0, 0, 0, 1]`

**Output (sorted):**  
`[1, 2, 2, 3, 3, 4, 8]`

---




