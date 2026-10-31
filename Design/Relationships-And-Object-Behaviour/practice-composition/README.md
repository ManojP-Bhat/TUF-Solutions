# [Practice (Composition)](https://takeuforward.org/practice/design/practice-composition?category=relationships-and-object-behaviour&source=oops)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Design a system to manage a composition relationship between a University and its Colleges. Implement the following:

**University** class :

**Attribute** : *colleges* (List of College objects), name (string)

**Methods** :

- *addCollege* (collegeName, collegeId): Adds a college to the university.
- *displayDetails* (): Prints the university's details along with all associated colleges.

**College** Class :

**Attributes** : *name* (String), *id* (String).

For output format refer the commented code on IDE.

### Example 1:

**Input:** name = "Global_University" ,

college Names = [ "COEP", "PICT", "VJTI", "WCE", "PCCOE" ]

college Id = [ "CO8543", "PI9514", "VJ8643", "VF569", "PC9246" ]

**Output:**

University Name : Global_University

College Name : COEP

College ID : CO8543

College Name : PICT

College ID : PI9514

College Name : VJTI

College ID : VJ8643

College Name : WCE

College ID : VF569

College Name : PCCOE

College ID : PC9246

**Explanation:**

- First we create the object of class University with name as argument to constructor.
- Then we call the method addCollege to add the mentioned college names and id under that university object.
- Then the displayDetails method is called to display the content of the University and Colleges.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

<h3 class="ProblemPanel-module__qBixIa__sectionTitle">Constraints:</h3>

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
