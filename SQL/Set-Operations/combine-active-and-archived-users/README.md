# [Combine Active and Archived Users](https://takeuforward.org/practice/sql/combine-active-and-archived-users?category=problems-level-1-merging-query-results&source=sql-data-engineering-foundations)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A platform stores user information in two separate tables:

- One for currently active users
- One for archived users

To generate a consolidated report, the company wants a unique list of all user IDs that have ever existed on the platform.

ActiveUsers

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║   user_id   ║   int    ║
╚═════════════╩══════════╝
```

- user_id is the primary key.

ArchivedUsers

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║   user_id   ║   int    ║
╚═════════════╩══════════╝
```

- user_id is the primary key.
- Some users may appear in both tables.

Write an SQL query to return all unique user_ids that appear in either ActiveUsers or ArchivedUsers. Return the result in any order.

### Example 1:

Input:

ActiveUsers:

```
╔══════════╗
║ user_id  ║
╠══════════╣
║    1     ║
║──────────║
║    2     ║
║──────────║
║    3     ║
╚══════════╝
```

ArchivedUsers:

```
╔══════════╗
║ user_id  ║
╠══════════╣
║    3     ║
║──────────║
║    4     ║
║──────────║
║    5     ║
╚══════════╝
```

Output:

```
╔══════════╗
║ user_id  ║
╠══════════╣
║    1     ║
║──────────║
║    2     ║
║──────────║
║    3     ║
║──────────║
║    4     ║
║──────────║
║    5     ║
╚══════════╝
```

Explanation

User 3 appears in both tables but is shown only once in the result.

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
