# [Practice (Inheritance)](https://takeuforward.org/practice/design/practice-inheritance?source=oops&category=core-principles-of-oops)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

You are tasked with creating a class hierarchy to represent employees in a company. Implement a base class **Employee** and derive classes **Manager** and **Engineer** from it. The base class should encapsulate common attributes, and the derived classes should add specific attributes while overriding methods. The derived classes should explicitly call the constructor of the parent class (Employee) to initialize common attributes.

The classes should consist of below specifications :

Base Class: **Employee**

- **Attributes** : 1) *name* (string) : Represents the name of the employee.

2) *id* (Integer) : Unique identifier for the employee.

- **Methods** : 1) *displayDetails* () : Prints the name and id.

Derived Classes : a) **Manager**

- **Attributes** : 1) *teamSize* (Integer) : The size of team managed.
- **Methods** : 1) *displayDetails* () : calls the parent class method *displayDetails* () and then prints *teamSize* .

b) **Engineer**

- **Attributes** : 1) *specialization* (string) : The engineer's area of interest.
- **Methods** : 1) *displayDetails* () : Calls the parent class method *displayDetails* () and then prints the *specialization* .

Refer the sample examples for understanding the output format.

The commented code has the output statements return, in order to avoid wrong answers due to case matching or whitespace.

The sample Input follows below naming convention

M -> Prefix of M means input to class Manager

E -> Prefix of E means input to class Engineer

### Example 1:

**Input:** M_name = "Jax" , M_id = 101 , M_teamSize = 8

E_name = "William" , E_id = 202 , E_specialization = "Backend Developer"

**Output:**

Manager Details

Name : Jax

Id : 101

Team Size : 8

Engineer Details

Name : William

Id : 202

Specialization : Backend Developer

**Explanation:**

- The object of Manager class is created with the parametrised constructor to initialize the attributes of both Manager and Employee class.
- Then we call the displayDetails of Manager class and print the data of both Employee and Manager class.
- We put an empty line between the data displayed for Manger and Engineer class as shown in output. ( This is already written in driver code, user does not have to add this empty line.)
- The object of Engineer class is created with the parametrised constructor to initialize the attributes of both Engineer and Employee class.
- Then we call the displayDetails of Engineer class and print the data of both Employee and Engineer class.

### Example 2:

**Input:** M_name = "Striver" , M_id = 10434 , M_teamSize = 50

E_name = "Siddhant" , E_id = 41241, E_specialization = "Full Stack Developer"

**Output:**

Manager Details

Name : Striver

Id : 10434

Team Size : 50

Engineer Details

Name : Siddhant

Id : 41241

Specialization : Full Stack Developer

**Explanation:**

- The object of Manager class is created with the parametrised constructor to initialize the attributes of both Manager and Employee class.
- Then we call the displayDetails of Manager class and print the data of both Employee and Manager class.
- We put an empty line between the data displayed for Manger and Engineer class as shown in output. ( This is already written in driver code, user does not have to add this new line.)
- The object of Engineer class is created with the parametrised constructor to initialize the attributes of both Engineer and Employee class.
- Then we call the displayDetails of Engineer class and print the data of both Employee and Engineer class.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= Id <= 10^5
- 1 <= team size <= 10^5

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
