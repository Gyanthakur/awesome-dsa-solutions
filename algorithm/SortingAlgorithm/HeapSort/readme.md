# ⚙️ Heap Sort Algorithm

## 📘 Overview
Heap Sort is a **comparison-based** sorting algorithm that uses a **binary heap data structure**.  
It divides its operation into two main phases:
1. **Build a max heap** from the input array.
2. **Extract the maximum element** one by one and place it at the end of the array.

This process continues until the array is sorted in ascending order.

---

## 🧩 Working Principle
1. Build a **max heap** from the unsorted array.
2. The largest element (root of heap) is swapped with the last element.
3. Reduce the heap size and heapify again.
4. Repeat until all elements are sorted.

---

## 📊 Time & Space Complexity

| Case | Time Complexity | Space Complexity |
|------|------------------|------------------|
| Best | O(n log n) | O(1) |
| Average | O(n log n) | O(1) |
| Worst | O(n log n) | O(1) |

---

## ✅ Example
**Input:**  
`[4, 10, 3, 5, 1]`

**Build max heap:**  
`[10, 5, 3, 4, 1]`

**After sorting:**  
`[1, 3, 4, 5, 10]`

---

