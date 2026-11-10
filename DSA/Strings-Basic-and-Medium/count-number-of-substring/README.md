# [Count Number of Substrings](https://takeuforward.org/practice/dsa/count-number-of-substring?source=strivers-a2z-dsa-sheet&category=substring-problems&solution=brute-force)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

You are given a string s consisting of lowercase English letters from 'a' to 'j'.

A substring is considered valid if at most one character occurs an odd number of times in that substring.

Return the total number of valid substrings in s.

A substring is a contiguous, non-empty sequence of characters within a string.

### Example 1:

**Input:** s = "aba"

**Output:** 4

**Explanation:** The valid substrings are "a", "b", "a", and "aba". Each contains at most one character with an odd frequency.

### Example 2:

**Input:** s = "aabb"

**Output:** 9

**Explanation:** There are 10 substrings in total. The only invalid substring is "ab", where both 'a' and 'b' occur an odd number of times. Hence, the answer is 9.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= s.length <= 10^5
- s consists only of lowercase English letters from 'a' to 'j'.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
