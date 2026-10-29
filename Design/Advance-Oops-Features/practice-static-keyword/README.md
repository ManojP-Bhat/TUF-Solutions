# [Practice (Static Keyword)](https://takeuforward.org/practice/design/practice-static-keyword?category=advance-oops-features&source=oops)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

You are required to design a class **Counter** to keep track of how many objects have been created from it. The tracking must be done using the static keyword to ensure a single shared variable across all instances of the class. The class should contain below specification :

**Attributes :**

- *count* (Integer) : A static variable that tracks the total number of objects created.

**Methods :**

- A *default constructor* that increments the count variable each time a new object is instantiated.
- *getCount* () : A static method that returns the current value of the count variable.
- *resetCount* () : A static method to reset the value of count variable to 0.

Refer the sample examples for understanding the output format.

Refer the commented code on IDE for output statements

### Example 1:

**Input:** count = 10

**Output:**

Number of objects created : 10

**Explanation:**

- Total count of objects that will be created is taken as input.
- Then 'count' number of different objects are instantiated.
- At each instantiation the constructor increments the count of object.
- Now *getCount* method is called which returns the total number of objects instantiated.
- At end we call the resentCount() method to resent the count to 0.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= count <= 10^5

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
