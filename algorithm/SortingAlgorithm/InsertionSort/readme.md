# 🧩 Insertion Sort Algorithm

## 📘 Overview
Insertion Sort is a **simple and intuitive** comparison-based sorting algorithm.  
It works similarly to how we sort playing cards in our hands — by inserting each element into its correct position within the already-sorted portion of the array.

---

## ⚙️ How It Works
1. Assume the first element is already sorted.  
2. Take the next element and compare it with the previous ones.  
3. Shift all larger elements one position to the right.  
4. Insert the current element into its correct position.  
5. Repeat until all elements are sorted.

---

## 📊 Time & Space Complexity

| Case | Time Complexity | Space Complexity |
|------|------------------|------------------|
| Best | O(n) *(Already sorted array)* | O(1) |
| Average | O(n²) | O(1) |
| Worst | O(n²) | O(1) |

---

## ✅ Example
**Input:**  
`[5, 3, 4, 1, 2]`

**Pass 1:** `[3, 5, 4, 1, 2]`  
**Pass 2:** `[3, 4, 5, 1, 2]`  
**Pass 3:** `[1, 3, 4, 5, 2]`  
**Pass 4:** `[1, 2, 3, 4, 5]`

**Output:** `[1, 2, 3, 4, 5]`

---


