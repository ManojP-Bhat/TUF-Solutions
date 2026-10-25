# [Practice (Polymorphism)](https://takeuforward.org/practice/design/practice-polymorphism?category=core-principles-of-oops&source=oops)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Design a class **ShapeCalculator** that calculates the area of different shapes using method overloading. Implement the below attributes and methods to calculate the area of different shapes :

**Methods :**

- *area* (integer radius) : Calculates and print the area of circle using the formula π×radius^2&nbsp;.
- *area* (integer length, integer width) : Calculates and print the area of rectangle using the formula (length * width).
- *area* (integer base1, integer base2, integer height) : Calculates and print the area of Trapezoid using the formula ( (base1 + base2) * height) / 2.

Refer the sample examples for understanding the output format.

Refer the commented code for the output statements.

Consider π = 3.14

**Note** : Print the Area in integer format. Round down to nearest integer i.e. 3.9 should b 3, 2.1 should be 2.

### Example 1:

**Input:** base1 = 2 , base2 = 3, height = 2, length = 2, radius = 2 , width = 3

**Output:**

Area of Circle : 12

Area of Rectangle : 6

Area of Trapezoid : 5

**Explanation:**

- We create the object of the class **ShapeCalculator.**
- Calls the area method with radius as argument. It calculates and prints the area of circle.
- Calls the area method with length and width as arguments. It calculates and prints the area of rectangle.
- Calls the area method with base1, base2, height as arguments. It calculates and prints the area of trapezoid.

### Example 2:

**Input:** base1 = 4, base2 = 3, height = 5, length = 2, radius = 3 , width = 5

**Output:**

Area of Circle : 28

Area of Rectangle : 10

Area of Trapezoid : 17

**Explanation:**

- We create the object of the class **ShapeCalculator.**
- Calls the area method with radius as argument. It calculates and prints the area of circle.
- Calls the area method with length and width as arguments. It calculates and prints the area of rectangle.
- Calls the area method with base1, base2, height as arguments. It calculates and prints the area of trapezoid.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= radius, length, width, base1, base2, height <= 10^4

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
