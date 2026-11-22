# [Students Enrolled in Courses](https://takeuforward.org/practice/sql/students-enrolled-in-courses?category=problems-level-1-joins-deep-dive&source=sql-data-engineering-foundations)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

An online education platform wants to list students along with the courses they are enrolled in. You are given two tables Students and Enrollments. Both tables share a common column named student_id.

Table: Students

```
╔════════════╦══════════╗
║   Column   ║   Type   ║
╠════════════╬══════════╣
║ student_id ║   int    ║
║────────────┼──────────║
║    name    ║ varchar  ║
╚════════════╩══════════╝
```

- student_id is the primary key.

Table: Enrollments

```
╔════════════╦══════════╗
║   Column   ║   Type   ║
╠════════════╬══════════╣
║ student_id ║   int    ║
║────────────┼──────────║
║   course   ║ varchar  ║
╚════════════╩══════════╝
```

- Each row represents a student enrolled in a course.

Write an SQL query using NATURAL JOIN only to return:

- name
- course

Return the result in any order.

### Example 1:

Input:

Students:

```
╔════════════╦══════════╗
║ student_id ║   name   ║
╠════════════╬══════════╣
║     1      ║  Aarav   ║
║────────────┼──────────║
║     2      ║   Neha   ║
║────────────┼──────────║
║     3      ║  Rohan   ║
╚════════════╩══════════╝
```

Enrollments:

```
╔════════════╦═══════════╗
║ student_id ║  course   ║
╠════════════╬═══════════╣
║     1      ║   Math    ║
║────────────┼───────────║
║     1      ║  Physics  ║
║────────────┼───────────║
║     3      ║ Chemistry ║
╚════════════╩═══════════╝
```

Output:

```
╔══════════╦═══════════╗
║   name   ║  course   ║
╠══════════╬═══════════╣
║  Aarav   ║   Math    ║
║──────────┼───────────║
║  Aarav   ║  Physics  ║
║──────────┼───────────║
║  Rohan   ║ Chemistry ║
╚══════════╩═══════════╝
```

Explanation:

Neha has no enrollment, so she is excluded.

Only matching student_id values appear.

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
