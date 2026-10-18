# [Practice (Access Modifiers)](https://takeuforward.org/practice/design/practice-access-modifiers?category=core-principles-of-oops&source=oops)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Design a class **Employee** to manage employee details securely using proper encapsulation and access modifiers. The class should implement the following attributes and methods :

**Attributes** :

- *name* (string) : public, Represents the name of employee.
- *employeeId* (Integer) : protected, Represents the unique Id of the employee.
- *salary* (double) : private, Represents the salary of the employee.

**Methods** :

- *setSalary* (double salary) : Sets the salary value, If salary is negative then print "Invalid salary" and set the salary to 0.
- *getSalary* () : Return the salary value.
- *parameterised constructor* to initialize the attributes. (If salary is negative then print "Invalid salary" and set the salary to 0.)
- *displayEmployeeDetails* () : Display the employee details in format specified below :

Refer the sample examples for understanding the output format.

Refer the commented code to check the output statments.

### Example 1:

**Input:** name = "Striver" , employeeId = 9656 , salary = 10000 , newSalary = 15840

**Output:**

Salary : 10000.00

Name : Striver

Employee Id : 9656

Salary : 15840.00

**Explanation:**

- An object employee of class Employee is created with parameterised constructor.
- A call is given to the *getSalary* method and it is displayed through the driver program itself.
- We call the *setSalary* method with newSalary as argument.
- Then we call the *displayEmployeeDetails* () method to print the details of the employee.

### Example 2:

**Input:** name = "Striver" , employeeId = 9656 , salary = -1050, newSalary = -9315

**Output:**

Invalid salary

Salary : 0.00

Invalid salary

Name : Striver

Employee Id : 9656

Salary : 0.00

**Explanation:**

- An object employee of class Employee is created with parameterised constructor. As the salary is in negative amount, so the constructor will print the text "Invalid salary" and set the salary to 0.00.
- A call is given to the *getSalary* method and it is displayed through the driver program itself.
- We call the *setSalary* method with newSalary as argument. As the newSalary is negative so we print the text "Invalid salary" and set the salary to 0.00.
- Then we call the *displayEmployeeDetails* () method to print the details of the employee.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= salary, newSalary <= 10^6

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
