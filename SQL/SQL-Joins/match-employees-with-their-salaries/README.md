# [Match Employees With Their Salaries](https://takeuforward.org/practice/sql/match-employees-with-their-salaries?category=problems-level-1-joins-deep-dive&source=sql-data-engineering-foundations)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A company stores employee details and salary information in two separate tables.

Only employees who have a corresponding salary record should appear in the final report.

Table: Employees

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
- Each row represents one employee.

Table: Salaries

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

Write an SQL query using ONLY IMPLICIT JOIN syntax to return employees who have salary records.

Return:

- employee_id
- name
- salary

The result can be returned in any order.

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

Explanation:

Neha has no salary record, so she is excluded.

Only rows where employee_id matches in both tables are returned.

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
