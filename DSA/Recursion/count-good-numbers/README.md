# [Count Good Numbers](https://takeuforward.org/practice/dsa/count-good-numbers?source=strivers-a2z-dsa-sheet&category=implementation-problems)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

A digit string is considered good if the digits at even indices **(0-based)** are even digits (0, 2, 4, 6, 8) and the digits at odd indices are prime digits (2, 3, 5, 7).

Given an integer **n** , return the total number of good digit strings of length n. As the result may be large, return it modulo 10^9 + 7.

**A digit string is a string consisting only of the digits '0' through '9'. It may contain leading zeros.**

### Example 1:

**Input:** n = 1

**Output:** 5

**Explanation:**

Only one index (0) → must be even.

Valid strings: "0", "2", "4", "6", "8"

### Example 2:

**Input:** n = 2

**Output:** 20

**Explanation:**

Index 0: 5 options (even digits)

Index 1: 4 options (prime digits)

Total: 5 * 4 = 20

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= n <= 10^15

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
