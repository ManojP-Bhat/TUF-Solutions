# [Employees With or Without Salary Records](https://takeuforward.org/practice/sql/employees-with-or-without-salary-records?category=problems-level-1-joins-deep-dive&source=sql-data-engineering-foundations)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

An HR system stores employee details and salary information in separate tables.

Due to synchronization issues:

- Some employees may be missing salary records.
- Some salary records may not have matching employee details.

Given two tables

Employees

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║ employee_id ║   int    ║
║─────────────┼──────────║
║    name     ║ varchar  ║
╚═════════════╩══════════╝
```

- employee_id is the primary key.
- Each row represents an employee.

Salaries

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║ employee_id ║   int    ║
║─────────────┼──────────║
║   salary    ║   int    ║
╚═════════════╩══════════╝
```

- employee_id is the primary key.
- Each row represents a salary record.

Write an SQL query to return all employee IDs, including:

- Employees who have a salary
- Employees who do not have a salary
- Salary records that do not have a matching employee

For each row, return:

- employee_id
- name
- salary

Return the result ordered by employee_id in ascending order.

### Example 1:

Input:

Employees:

```
╔═════════════╦══════════╗
║ employee_id ║   name   ║
╠═════════════╬══════════╣
║      1      ║  Aarav   ║
║─────────────┼──────────║
║      2      ║   Neha   ║
║─────────────┼──────────║
║      3      ║  Rohan   ║
╚═════════════╩══════════╝
```

Salaries:

```
╔═════════════╦══════════╗
║ employee_id ║  salary  ║
╠═════════════╬══════════╣
║      1      ║  50000   ║
║─────────────┼──────────║
║      4      ║  65000   ║
╚═════════════╩══════════╝
```

Output:

```
╔═════════════╦══════════╦══════════╗
║ employee_id ║   name   ║  salary  ║
╠═════════════╬══════════╬══════════╣
║      1      ║  Aarav   ║  50000   ║
║─────────────┼──────────┼──────────║
║      2      ║   Neha   ║   NULL   ║
║─────────────┼──────────┼──────────║
║      3      ║  Rohan   ║   NULL   ║
║─────────────┼──────────┼──────────║
║      4      ║   NULL   ║  65000   ║
╚═════════════╩══════════╩══════════╝
```

Explanation

- Employee 1 has both records, full data
- Employees 2 and 3 have no salary, salary is NULL
- Salary record for employee 4 has no employee, name is NULL

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
