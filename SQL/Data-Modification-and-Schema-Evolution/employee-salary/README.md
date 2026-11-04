# [Employee Salary](https://takeuforward.org/practice/sql/employee-salary?category=problems-level-1-editing-data-and-tables&source=sql-data-engineering-foundations)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

A company stores employee details in an Employees table. After a performance review, the HR team decided to give a salary hike to employees working in a specific department.

Table: Employees

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║ employee_id ║   int    ║
║─────────────┼──────────║
║    name     ║ varchar  ║
║─────────────┼──────────║
║ department  ║ varchar  ║
║─────────────┼──────────║
║   salary    ║   int    ║
╚═════════════╩══════════╝
```

- employee_id is the primary key.
- Each row represents one employee.

Existing Data

```
╔═════════════╦══════════╦═════════════╦══════════╗
║ employee_id ║   name   ║ department  ║  salary  ║
╠═════════════╬══════════╬═════════════╬══════════╣
║      1      ║  Aarav   ║ Engineering ║  70000   ║
║─────────────┼──────────┼─────────────┼──────────║
║      2      ║   Neha   ║     HR      ║  50000   ║
║─────────────┼──────────┼─────────────┼──────────║
║      3      ║  Rohan   ║ Engineering ║  80000   ║
║─────────────┼──────────┼─────────────┼──────────║
║      4      ║  Meera   ║   Finance   ║  65000   ║
╚═════════════╩══════════╩═════════════╩══════════╝
```

Increase the salary of all employees in the Engineering department by 10,000. Only employees belonging to Engineering should be updated.

### Example 1:

Output (After Update)

```
╔═════════════╦══════════╦═════════════╦══════════╗
║ employee_id ║   name   ║ department  ║  salary  ║
╠═════════════╬══════════╬═════════════╬══════════╣
║      1      ║  Aarav   ║ Engineering ║  80000   ║
║─────────────┼──────────┼─────────────┼──────────║
║      2      ║   Neha   ║     HR      ║  50000   ║
║─────────────┼──────────┼─────────────┼──────────║
║      3      ║  Rohan   ║ Engineering ║  90000   ║
║─────────────┼──────────┼─────────────┼──────────║
║      4      ║  Meera   ║   Finance   ║  65000   ║
╚═════════════╩══════════╩═════════════╩══════════╝
```

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
