# 🎯 Selection Sort Algorithm

## 📘 Overview
Selection Sort is a **simple comparison-based sorting algorithm**.  
It repeatedly selects the **smallest element** from the unsorted portion of the array and swaps it with the first unsorted element.

---

## ⚙️ How It Works
1. Divide the array into a **sorted** and **unsorted** section.  
2. Find the **minimum element** in the unsorted section.  
3. Swap it with the first unsorted element.  
4. Move the boundary one element ahead and repeat until the array is sorted.

---

## 📊 Time & Space Complexity

| Case | Time Complexity | Space Complexity |
|------|------------------|------------------|
| Best | O(n²) | O(1) |
| Average | O(n²) | O(1) |
| Worst | O(n²) | O(1) |

---

## ✅ Example
**Input:** `[64, 25, 12, 22, 11]`

**Pass 1:** `[11, 25, 12, 22, 64]`  
**Pass 2:** `[11, 12, 25, 22, 64]`  
**Pass 3:** `[11, 12, 22, 25, 64]`  
**Pass 4:** `[11, 12, 22, 25, 64]`

**Output:** `[11, 12, 22, 25, 64]`



## 🧠 Key Points
- **In-place sorting algorithm** (requires no extra memory).  
- **Not stable** — equal elements may change order.  
- Works well for **small datasets**, but inefficient for large ones.  
- Good for **educational purposes** and understanding sorting fundamentals.

