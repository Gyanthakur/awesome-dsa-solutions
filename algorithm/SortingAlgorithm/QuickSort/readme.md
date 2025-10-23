# ⚡ Quick Sort Algorithm

## 📘 Overview
Quick Sort is one of the most **efficient sorting algorithms**, widely used in practice.  
It’s a **divide and conquer** algorithm that works by selecting a **pivot element**, partitioning the array around it, and then recursively sorting the subarrays.

---

## ⚙️ How It Works
1. Choose a **pivot** element.
2. Partition the array so that:
   - Elements smaller than the pivot are on the **left**.
   - Elements greater than the pivot are on the **right**.
3. Recursively apply Quick Sort to both partitions.

---

## 📊 Time & Space Complexity

| Case | Time Complexity | Space Complexity |
|------|------------------|------------------|
| Best | O(n log n) | O(log n) |
| Average | O(n log n) | O(log n) |
| Worst | O(n²) *(when array is already sorted or all elements are same)* | O(log n) |

---

## ✅ Example
**Input:** `[10, 7, 8, 9, 1, 5]`

**Process:**
- Choose pivot = 5  
  Partition → `[1, 5, 8, 9, 10, 7]`
- Recursively sort left `[1]` and right `[8, 9, 10, 7]`

**Output:** `[1, 5, 7, 8, 9, 10]`

---

## 🧠 Key Points
- **Efficient** and used in real-world applications like C’s `qsort()`.  
- Performs best on **average** but can degrade to **O(n²)** in worst-case scenarios.  
- **In-place** sorting (no extra arrays needed).  
- **Not stable** (relative order of equal elements not preserved).


