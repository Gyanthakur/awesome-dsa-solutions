# 💧 Bubble Sort Algorithm

## 📘 Overview
Bubble Sort is one of the simplest sorting algorithms.  
It repeatedly **steps through the list**, compares adjacent elements, and **swaps them** if they are in the wrong order.  
This process continues until the list is fully sorted.

---

## ⚙️ How It Works
1. Compare adjacent elements in the array.
2. If the current element is greater than the next, swap them.
3. Continue this process for all elements.
4. Repeat the passes until no swaps are needed (array is sorted).

---

## 📊 Time & Space Complexity

| Case | Time Complexity | Space Complexity |
|------|------------------|------------------|
| Best | O(n) *(already sorted)* | O(1) |
| Average | O(n²) | O(1) |
| Worst | O(n²) | O(1) |

---

## ✅ Example
**Input:** `[5, 1, 4, 2, 8]`

**Pass 1:** `[1, 4, 2, 5, 8]`  
**Pass 2:** `[1, 2, 4, 5, 8]`  
**Pass 3:** `[1, 2, 4, 5, 8]` (no swaps → sorted)

**Output:** `[1, 2, 4, 5, 8]`

---

## 🧠 Key Points
- Very **simple** to understand and implement.  
- **Stable** sorting algorithm (preserves equal elements’ order).  
- **Inefficient** for large datasets due to O(n²) performance.  
- Useful for **teaching basic sorting logic** or when working with very small arrays.

