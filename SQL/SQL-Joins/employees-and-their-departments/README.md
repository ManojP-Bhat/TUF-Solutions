# [Employees and Their Departments](https://takeuforward.org/practice/sql/employees-and-their-departments?category=problems-level-1-joins-deep-dive&source=sql-data-engineering-foundations)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A company stores information about its employees and departments.

Some departments may exist even if no employees are currently assigned to them.

You are given two tables:

**Employee Table**

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║ employee_id ║   int    ║
║─────────────┼──────────║
║    name     ║ varchar  ║
║─────────────┼──────────║
║   dept_id   ║   int    ║
╚═════════════╩══════════╝
```

- employee_id is the primary key
- dept_id indicates the department an employee belongs to

**Department Table**

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║   dept_id   ║   int    ║
║─────────────┼──────────║
║  dept_name  ║ varchar  ║
╚═════════════╩══════════╝
```

- dept_id is the primary key
- Each row represents a department

Write an SQL query to return all departments, including those without any employees.

For departments without employees, display NULL for employee details. The result can be returned in any order.

### Example 1:

Input:

Employee:

```
╔═════════════╦══════════╦══════════╗
║ employee_id ║   name   ║ dept_id  ║
╠═════════════╬══════════╬══════════╣
║      1      ║  Alice   ║    10    ║
║─────────────┼──────────┼──────────║
║      2      ║   Bob    ║    20    ║
╚═════════════╩══════════╩══════════╝
```

Department:

```
╔══════════╦═══════════╗
║ dept_id  ║ dept_name ║
╠══════════╬═══════════╣
║    10    ║    HR     ║
║──────────┼───────────║
║    20    ║    IT     ║
║──────────┼───────────║
║    30    ║  Finance  ║
╚══════════╩═══════════╝
```

Output:

```
╔═════════════╦══════════╦═══════════╗
║ employee_id ║   name   ║ dept_name ║
╠═════════════╬══════════╬═══════════╣
║      1      ║  Alice   ║    HR     ║
║─────────────┼──────────┼───────────║
║      2      ║   Bob    ║    IT     ║
║─────────────┼──────────┼───────────║
║    NULL     ║   NULL   ║  Finance  ║
╚═════════════╩══════════╩═══════════╝
```

Explanation:

Finance department exists but has no employees, so employee fields are **NULL** .

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
