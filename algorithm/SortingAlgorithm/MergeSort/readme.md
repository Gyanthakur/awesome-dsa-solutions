# ⚙️ Merge Sort Algorithm

## 📘 Overview
Merge Sort is a **Divide and Conquer** algorithm.  
It divides the array into two halves, recursively sorts them, and then merges the sorted halves into one sorted array.

---

## ⚙️ How It Works
1. **Divide** the array into two halves.
2. **Recursively sort** each half.
3. **Merge** the two sorted halves to produce the final sorted array.

---

## 📊 Time & Space Complexity

| Case | Time Complexity | Space Complexity |
|------|------------------|------------------|
| Best | O(n log n) | O(n) |
| Average | O(n log n) | O(n) |
| Worst | O(n log n) | O(n) |

---

## ✅ Example
**Input:** `[38, 27, 43, 3, 9, 82, 10]`

**Divide:** `[38, 27, 43, 3]` and `[9, 82, 10]`  
**Sort + Merge:** `[3, 27, 38, 43, 9, 10, 82]`  
**Final Output:** `[3, 9, 10, 27, 38, 43, 82]`

---

## 🚀 Implementations

Each language version is available in a separate file:

- 🐍 **Python** → [`merge_sort.py`](./merge_sort.py)  
- ☕ **Java** → [`MergeSort.java`](./MergeSort.java)  
- 💻 **C++** → [`merge_sort.cpp`](./merge_sort.cpp)

---

## 🧠 Key Points
- **Stable sorting algorithm** (preserves order of equal elements).  
- Performs consistently in **O(n log n)** time.  
- Requires **extra space O(n)** due to temporary arrays.  
- Used in many **hybrid sorting algorithms** (like Timsort).

