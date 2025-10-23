# ⚡ Radix Sort Algorithm

## 📘 Overview
Radix Sort is a **non-comparative, integer-based sorting algorithm**.  
It sorts elements by processing individual digits — starting from the **least significant digit (LSD)** to the **most significant digit (MSD)**.

---

## ⚙️ How It Works
1. Find the **maximum number** to know the number of digits.
2. Sort the array **digit by digit** using a **stable counting sort** as a subroutine.
3. Start from the **least significant digit** and move towards the most significant.

---

## 📊 Time & Space Complexity

| Case | Time Complexity | Space Complexity |
|------|------------------|------------------|
| Best | O(nk) | O(n + k) |
| Average | O(nk) | O(n + k) |
| Worst | O(nk) | O(n + k) |

> Where **n** = number of elements and **k** = number of digits in the largest number.

---

## ✅ Example
**Input:** `[170, 45, 75, 90, 802, 24, 2, 66]`

**Step-by-step:**
- Sort by 1s digit → `[170, 90, 802, 2, 24, 45, 75, 66]`
- Sort by 10s digit → `[802, 2, 24, 45, 66, 170, 75, 90]`
- Sort by 100s digit → `[2, 24, 45, 66, 75, 90, 170, 802]`

**Output:** `[2, 24, 45, 66, 75, 90, 170, 802]`


---

## 🧠 Key Points
- **Stable sorting algorithm** ✅  
- **Works only for integers or fixed-length strings** 🔢  
- **Efficient when digit length (k)** is much smaller than the number of elements (n).  
- Commonly used in **digit-based** or **string-based** sorting applications.

---
