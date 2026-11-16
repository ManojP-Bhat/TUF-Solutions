# [Generate All Possible User-Category Pairs](https://takeuforward.org/practice/sql/generate-all-possible-user-category-pairs?source=sql-data-engineering-foundations&category=problems-level-1-joins-deep-dive)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A recommendation system wants to precompute all possible combinations of users and content categories so that personalized suggestions can later be applied.

Table: Users

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║   user_id   ║   int    ║
║─────────────┼──────────║
║    name     ║ varchar  ║
╚═════════════╩══════════╝
```

- user_id is the primary key.
- Each row represents a registered user.

Table: Categories

```
╔═════════════╦══════════╗
║ Column Name ║    Type  ║
╠═════════════╬══════════╣
║ category_id ║   int    ║
║─────────────┼──────────║
║  category   ║ varchar  ║
╚═════════════╩══════════╝
```

- category_id is the primary key.
- Each row represents a content category.

Write an SQL query to generate all possible combinations of users and categories. The result can be returned in any order.

### Example 1:

Input:

Users:

```
╔══════════╦══════════╗
║ user_id  ║   name   ║
╠══════════╬══════════╣
║    1     ║  Aarav   ║
║──────────┼──────────║
║    2     ║   Neha   ║
╚══════════╩══════════╝
```

Categories:

```
╔═════════════╦══════════╗
║ category_id ║ category ║
╠═════════════╬══════════╣
║     10      ║  Sports  ║
║─────────────┼──────────║
║     20      ║  Music   ║
╚═════════════╩══════════╝
```

Output:

```
╔══════════╦══════════╦═════════════╦══════════╗
║ user_id  ║   name   ║ category_id ║ category ║
╠══════════╬══════════╬═════════════╬══════════╣
║    1     ║  Aarav   ║     10      ║  Sports  ║
║──────────┼──────────┼─────────────┼──────────║
║    1     ║  Aarav   ║     20      ║  Music   ║
║──────────┼──────────┼─────────────┼──────────║
║    2     ║   Neha   ║     10      ║  Sports  ║
║──────────┼──────────┼─────────────┼──────────║
║    2     ║   Neha   ║     20      ║  Music   ║
╚══════════╩══════════╩═════════════╩══════════╝
```

Explanation

There are 2 users and 2 categories, so total rows = 2 × 2 = 4.

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
