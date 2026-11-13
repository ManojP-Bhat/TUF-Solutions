# [Employees With Confirmed Salary Records](https://takeuforward.org/practice/sql/employees-with-confirmed-salary-records?category=problems-level-1-joins-deep-dive&source=sql-data-engineering-foundations)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

An HR system stores employee information and salary details in separate tables. Only employees who have both personal details and salary records are considered valid for payroll processing.

**Table: Employees**

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

**Table: Salaries**

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
- Each row represents a salary entry.

Write an SQL query to return only those employees who have a salary record.

For each qualifying employee, return:

- employee_id
- name
- salary

The result can be returned in any order.

### Example 1:

Example:

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
║      3      ║  60000   ║
╚═════════════╩══════════╝
```

Output:

```
╔═════════════╦══════════╦══════════╗
║ employee_id ║   name   ║  salary  ║
╠═════════════╬══════════╬══════════╣
║      1      ║  Aarav   ║  50000   ║
║─────────────┼──────────┼──────────║
║      3      ║  Rohan   ║  60000   ║
╚═════════════╩══════════╩══════════╝
```

Explanation

Neha does not have a salary record, so she is excluded.

Only employees present in both tables appear in the output.

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
